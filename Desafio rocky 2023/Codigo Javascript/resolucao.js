const { error } = require("console");
const fs = require("fs");
const database1 = require("./broken_database_1.json");
const database2 = require("./broken_database_2.json");

// exibicao dos database corrombidos
console.log(database1);
console.log(database2);

//<summary>
// a function leitura recebe o primeiro banco de dados em JSON e a retorna em um formato para ser usado.
//</summary>
function LeituraDatabase1() {
    //fs.readFileSync le o banco de dados em formato JSON, de nome broken-database.
    // e armazena na variavel recebe_JSON.
    const recebe_JSON = fs.readFileSync("./broken_database_1.json");
    // atraves do JSON.parse ele converte para o formato javascript.
    // e armazena na variavel dados.
    const dados = JSON.parse(recebe_JSON);
    return dados;
}
//<summary>
// a function leitura recebe o segundo banco de dados em JSON e a retorna em um formato para ser usado.
//</summary>
function LeituraDatabase2() {
    //fs.readFileSync le o banco de dados em formato JSON, de nome broken-database.
    // e armazena na variavel recebe_JSON.
    const recebe_JSON = fs.readFileSync("./broken_database_2.json");
    // atraves do JSON.parse ele converte para o formato javascript.
    // e armazena na variavel dados.
    const dados = JSON.parse(recebe_JSON);
    return dados;
}
//<summary>
/// a function CorrigeName utiliza o replace para alterar os caracteres que apresentavam erro.
//</summary>
function CorrigeCatacter(nome) {
    // define quais caracteres serao mudados e para quais.
    const correcao = { æ: "a", ø: "o" };
    // gi: g = global i=ignore
    return nome.replace(/æ|ø/gi, function(retorno) {
        return correcao[retorno];
    });
}

//<summary>
// retorna o preco no formato correto
//</summary>
function CorrigeValor(valor_do_veiculo) {
    // usa o pasrsefloat para transformar do formato string para float.
    return parseFloat(valor_do_veiculo);
}
//<summary>
// Essa funcao vai executar as anteriores no primeiro database.
//</summary>
function Database1Corrigido() {
    // .map para que a acao seja realizada em todos os elementos e cria o novo database
    const corrigido = LeituraDatabase1().map(function(dados) {
        return {
            data: dados.data,
            id_marca: dados.id_marca_,
            vendas: CorrigeValor(dados.vendas),
            valor_do_veiculo: dados.valor_do_veiculo,
            nome: CorrigeCatacter(dados.nome),
        };
    });

    // no return usamos fs.writeFileSync para criar um novo arquivo que sera o novo database
    return fs.writeFileSync(
        //nome, localidade e tipo do arquivo a ser criado
        "./saida_database1.json",
        //converter os dados que foram corrigidos para o formato JSON
        JSON.stringify(corrigido),
        // definindo o callback
        (error, result) => {
            if (error) {
                console.error(error);
                return;
            }

            console.log(result);
        }
    );
}
//<summary>
// Essa funcao vai executar as anteriores no segundo database.
//</summary>
function Database2Corrigido() {
    // .map para que a acao seja realizada em todos os elementos e cria o novo database 
    const corrigido = LeituraDatabase2().map(function(dados) {
        return {
            id_marca: dados.id_marca,
            marca: CorrigeCatacter(dados.marca),
        };
    });

    // no return usamos fs.writeFileSync para criar um novo arquivo que sera o novo database
    return fs.writeFileSync(
        //nome, localidade e tipo do arquivo a ser criado
        "./saida_database2.json",
        //converter os dados que foram corrigidos para o formato JSON
        JSON.stringify(corrigido),
        // definindo o callback
        (error, result) => {
            if (error) {
                console.error(error);
                return;
            }

            console.log(result);
        }
    );
}

//<summary>
// vai executar as funcoes.
//</summary>
Database1Corrigido();
Database2Corrigido();