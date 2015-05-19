--1) Identifique e liste quantos valores diferentes estão definidos para a coluna Situacao da tabela Produto 
--(somente os distintos valores).

Select distinct Situacao
From Produto

--2) Liste todos os clientes que tenham o LTDA no nome ou razao social.

Select Nome, RazaoSocial 
from cliente
where nome like '%LTDA%' or RazaoSocial like '%LTDA%'

--3) Crie (insira) um novo registro na tabela de Produto, com as seguintes informações:
--Nome: Galocha Maragato
--Preço de custo: 35.67
--Preço de venda: 77.95
--Situação: A

Begin Transaction

insert into Produto
	(Nome,
	PrecoCusto,
	PrecoVenda,
	Situacao)
values
	('Galocha Maragato',
	35.67,
	77.95,
	'A')

commit

--4) Identifique e liste os produtos que não tiveram nenhum pedido, considere os relacionamentos no modelo de dados, 
--pois não há relacionamento direto entre Produto e Pedido (será preciso relacionar PedidoItem).
--Obs.: o produto criado anteriormente deverá ser listado.

Select Produto.nome
From Produto
LEFT JOIN PedidoItem ON Produto.IDProduto = PedidoItem.IDProduto
where PedidoItem.IDPedido is null

--5) Identifique qual o estado (coluna UF da tabela Cidade) possuí o maior número de clientes (tabela Cliente), 
--liste também qual o Estado possuí o menor número de clientes.
--Dica: pode (não é obrigatório) ser utilizado subquery, e também UNION.
