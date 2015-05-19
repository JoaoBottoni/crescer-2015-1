--exercício1

Begin transaction
go

SELECT Substring (nome, 1, CharIndex(' ', nome) -1) [PrimeiroNome]
FROM ASSOCIADO

commit

--exercício2

Begin transaction
go

SELECT 
	nome, 
	datediff(YEAR, DataNascimento, getdate()) as Idade
FROM Associado

commit

--exercício3

Begin transaction
go

SELECT
	nomeempregado as Nome,
	datediff(month, DataAdmissao, convert(date, '31/12/2000', 103)) as MesesTrabalhados
FROM Empregado
WHERE DataAdmissao between convert(date, '01/05/1980', 103)
	AND convert(date, '20/01/1982', 103);

commit

--exercício4

Begin transaction
go

Select Top 1 Cargo
From Empregado
Group By Cargo
Order by count(1) desc

commit

--exercício5

Begin transaction
go

Select Top 1 Nome
From Associado
Order by len(nome) desc

commit

--exercício6

Begin transaction
go

Select Nome,
	dateadd(year, 50, DataNascimento) as DataDos50Anos,
	datename(dw,dateadd(year, 50, DataNascimento)) as DiaDaSemana
From Associado

commit

--exercício7

Begin transaction
go

Select UF,
	count(1) as NumeroCidades
From Cidade
Group by UF;

commit

--exercício8

Begin transaction
go

Select Distinct Nome, UF
From Cidade 
GROUP BY Nome, UF
HAVING count(Nome) > 1 and count(UF) > 1

commit

--exercício9

Begin transaction
go

Select Top 1 IDAssociado + 1 as ProximoID
From Associado
Order by IDAssociado desc

commit

--exercício10

Begin transaction
go

Truncate table CidadeAux

insert into CidadeAux (IDCidade, Nome, UF)
	select
	IDCidade, Nome, UF
from Cidade;

With cte as(
	Select Nome, UF,
	RN = row_number()over(
		partition by Nome, UF
		order by Nome, UF)
	From CidadeAux)
Delete from cte where RN >1

commit

--exercício11

Begin transaction
go

Update cidade
set Nome = '*' + Nome
where nome in (select nome
			   from cidade
			   group by nome
			   having count(1) > 1
			   )

commit

--exercício12

Begin transaction
go

Select Nome, Sexo,
	Case Sexo
		When 'M' then 'Masculino'
		When 'F' then 'Feminino'
		else 'Outro'
	End Genero
From Associado;

commit

--exercício13

Begin transaction
go

Select NomeEmpregado, 
	   Salario,
	   Case 
			when Salario between 1164.01 and 2326 then (salario*0.15)
			when Salario > 2326 then (Salario*0.275)
			else 0
	   End Desconto_IR
From Empregado

commit

--exercício14

Begin transaction
go

Delete from Cidade
where IDCidade in (Select MAX(IDCidade)
				   From Cidade
				   Group by Nome, UF
				   Having count(1) > 1)

Select MAX(IDCidade) as MaiorIDCidadeDuplicada
From Cidade
Group by Nome, UF
Having count(1) > 1

commit

--exercício15

Begin transaction
go

Alter table Cidade 
	add constraint UK_Cidade_NomeUF
	unique(Nome,UF);

commit