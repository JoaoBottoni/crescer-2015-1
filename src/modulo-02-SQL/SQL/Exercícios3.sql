--removendo * do início do nome de algumas cidades.

begin transaction

update cidade
set nome = replace(Nome, '*', '')
Where nome like '*%'

select * from cidade

commit

--Criando e utilizando uma view

create view vw_Cidade_Regiao as (Consulta)

select * from vw_Cidade_Regiao

--Exercício1 - Selecione o nome do empregado e nome do departamento que cada um está associado.

Select e.NomeEmpregado as NomeEmpregado,
	   d.NomeDepartamento as NomeDepartamento
From Empregado e
INNER JOIN Departamento d ON d.IDDepartamento = e.IDDepartamento

--Exercício2 - Exibir o nome do associado e sua cidade, exibir também associados sem Cidade relacionada.

Select a.Nome as NomeAssociado,
	   c.Nome as NomeCidade
From Associado a
LEFT JOIN Cidade c ON c.IDCidade = a.IDCidade

--Exercício3 - Lista os estados (UF) e total de cidades que não possuem associados relacionados 
--(dica: pode ser utilizado count + group by + exists).

Select c.UF, count(1) as CidadesSemAssociados
From Cidade c
Where NOT EXISTS(Select 1
			 From Associado a
			 Where a.IDCidade = c.IDCidade)
Group by c.UF

--Exercício4 - Faça uma consulta que liste o nome do associado, o nome da cidade, 
--e uma coluna que indique se a cidade é da região SUL (RS, SC, PR), se for imprimir *** (3 asteriscos), senão imprimir nulo.

Select a.Nome as NomeAssociado, 
       c.Nome as NomeCidade,
	   case when c.UF in ('SC', 'PR', 'RS') then '***'
			else null
	   End as RegiaoSul
From Associado a
Left join Cidade c on c.IDCidade = a.IDCidade

--Exercício5


