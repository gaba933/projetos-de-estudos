const { error } = require("console");
const fs = require("fs");
const database = require("./broken-database.json");

console.log(database);
///<summary>
/// a function leitura recebe o banco de dados em JSON e a retorna em um formato para ser usado.
///</summary>
function leitura() {
  //fs.readFileSync le o banco de dados em formato JSON, de nome broken-database.
  // e armazena na variavel na variavel recebe_JSON.
  const recebe_JSON = fs.readFileSync("./broken-database.json");
  // atraves do JSON.parse ele converte para o formato javascript.
  // e armazena na variavel na variavel dados.
  const dados = JSON.parse(recebe_JSON);
  return dados;
}
///<summary>
/// a function CorrigeName utiliza o replace para alterar os caracteres que apresentavam erro.
///</summary>
function CorrigeName(name) {
  // define quais caracteres serao mudados e para quais.
  const correcao = { æ: "a", "¢": "c", ß: "b", ø: "o" };
  // /gi: g = global i=ignore
  return name.replace(/æ|¢|ß|ø/gi, function (retorno) {
    return correcao[retorno];
  });
}

///<summary>
/// retorna o preco no formato correto
///</summary>
function CorrigePrice(price) {
  // usa o pasrsefloat para transformar do formato string para float.
  return parseFloat(price);
}

///<summary>
/// corrige a oa valor de quantidade que avia sumido.
///</summary>
function CorrigeQuantity(quantity) {
  // se o objeto tiver um valor ele mantem mas se nao ele adiciona oa vlor 0
  if (quantity > 0) return quantity;
  else return 0;
}

///<summary>
// Essa funcao vai executar as anteriores.
///</summary>
function ArquivoCorrigido() {
  // .map para que a acao seja realizada em todos os elementos e cria o novo database
  const corrigido = leitura().map(function (data) {
    return {
      id: data.id,
      name: CorrigeName(data.name),
      quantity: CorrigeQuantity(data.quantity),
      price: CorrigePrice(data.price),
      category: data.category,
    };
  });

  // no return usamos fs.writeFileSync para criar um novo arquivo que sera o novo database
  return fs.writeFileSync(
    ///nome, localidade e tipo do arquivo a ser criado
    "./saida.json",
    ///converter os dados que foram corrigidos para o formato JSON
    JSON.stringify(corrigido),
    /// definindo o callback
    (error, result) => {
      if (error) {
        console.error(error);
        return;
      }

      console.log(result);
    }
  );
}

///<summary>
/// A OrdenaSaida vai mostrar objetos na ordem estibulada
///</summary>
function OrdenaSaida() {
  // recebe o novo databese
  const recebe_JSON = fs.readFileSync("saida.json");
  const dados = JSON.parse(recebe_JSON);

  // o sort para ordenar segundo os parametros
  dados.sort(function (a, b) {
    if (a.category < b.category) {
      return -1;
    } else {
      if (a.category == b.category && a.id < b.id) {
        return -1;
      }
    }
  });
  return console.log(dados);
}

///<summary>
///
///</summary>
function Estoque() {
  var recebe_JSON = fs.readFileSync("saida.json");
  var dados = JSON.parse(recebe_JSON);
  var panelas = 0;
  var Eletrodomesticos = 0;
  var Eletronicos = 0;
  var Acessorios = 0;

  // o forEach para executar a funcao do calculo em todos elementos selecionados
  dados.forEach((data) => {
    if (data.category == "Panelas") {
      panelas = panelas + data.quantity * data.price;
    }

    if (data.category == "Eletrodomésticos") {
      Eletrodomesticos = Eletrodomesticos + data.quantity * data.price;
    }

    if (data.category == "Eletrônicos") {
      Eletronicos = Eletronicos + data.quantity * data.price;
    }
    if (data.category == "Acessórios") {
      Acessorios = Acessorios + data.quantity * data.price;
    }
  });
  console.log("Valor total de panelas:", panelas);
  console.log("Valor total de Eletrodomesticos:", Eletrodomesticos);
  console.log("Valor total de Eletronicos:", Eletronicos);
  console.log("Valor total de Acessorios:", Acessorios);
}

/// execucao das funcoes
ArquivoCorrigido();

OrdenaSaida();

Estoque();
