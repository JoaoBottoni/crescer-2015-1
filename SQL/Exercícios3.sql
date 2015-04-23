--Exerc�cio1 - Selecione o nome do empregado e nome do departamento que cada um est� associado.

Select e.NomeEmpregado as NomeEmpregado,
	   d.NomeDepartamento as NomeDepartamento
From Empregado e
LEFT JOIN Departamento d ON d.IDDepartamento = e.IDDepartamento

--Exerc�cio2 - Exibir o nome do associado e sua cidade, exibir tamb�m associados sem Cidade relacionada.

Select a.Nome as NomeAssociado,
	   c.Nome as NomeCidade
From Associado a
LEFT JOIN Cidade c ON c.IDCidade = a.IDCidade

--Exerc�cio3 - Lista os estados (UF) e total de cidades que n�o possuem associados relacionados 
--(dica: pode ser utilizado count + group by + exists).

Select c.UF, count(1) as CidadesSemRegistro
From Cidade c
Where NOT EXISTS(Select 1
			 From Associado a
			 Where a.IDCidade = c.IDCidade)
Group by c.UF

--Exerc�cio4 - Fa�a uma consulta que liste o nome do associado, o nome da cidade, 
--e uma coluna que indique se a cidade � da regi�o SUL (RS, SC, PR), se for imprimir *** (3 asteriscos), sen�o imprimir nulo.

Select a.Nome, 
       c.Nome as Cidade_Sul
From Associado a
Left join (Select IDCidade, ('***') as Nome
			From Cidade
			Where UF in ('SC', 'PR', 'RS') )as c
on c.IDCidade = a.IDCidade

