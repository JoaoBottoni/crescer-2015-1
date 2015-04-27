--1) Identifique e liste quantos valores diferentes est�o definidos para a coluna Situacao da tabela Produto 
--(somente os distintos valores).

Select distinct Situacao
From Produto

--2) Liste todos os clientes que tenham o LTDA no nome ou razao social.

Select Nome, RazaoSocial 
from cliente
where nome like '%LTDA%' or RazaoSocial like '%LTDA%'

--3) Crie (insira) um novo registro na tabela de Produto, com as seguintes informa��es:
--Nome: Galocha Maragato
--Pre�o de custo: 35.67
--Pre�o de venda: 77.95
--Situa��o: A

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

--4) Identifique e liste os produtos que n�o tiveram nenhum pedido, considere os relacionamentos no modelo de dados, 
--pois n�o h� relacionamento direto entre Produto e Pedido (ser� preciso relacionar PedidoItem).
--Obs.: o produto criado anteriormente dever� ser listado.

Select Produto.nome
From Produto
LEFT JOIN PedidoItem ON Produto.IDProduto = PedidoItem.IDProduto
where PedidoItem.IDPedido is null

--5) Identifique qual o estado (coluna UF da tabela Cidade) possu� o maior n�mero de clientes (tabela Cliente), 
--liste tamb�m qual o Estado possu� o menor n�mero de clientes.
--Dica: pode (n�o � obrigat�rio) ser utilizado subquery, e tamb�m UNION.
