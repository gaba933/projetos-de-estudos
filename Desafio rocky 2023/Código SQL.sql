CREATE TABLE Relatorio_Geral(
  data VARCHAR(50),
  id_marca int,
  vendas int,
  valor_do_veiculo int,
  nome VARCHAR(50),
  marca VARCHAR(50)
  )
  INSERT INTO Relatorio_Geral(data, id_marca, vendas, valor_do_veiculo, nome, marca)
  SELECT
  	A.data, A.id_marca, A.vendas, A.valor_do_veiculo, A.nome, B.marca
  FROM
  	saida_database1 A FULL JOIN saida_database2 B
    	ON A.id_marca = B.id_marca;