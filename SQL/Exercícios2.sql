-- exercício1
SELECT Substring (nome, 1, CharIndex(' ', nome) -1) [PrimeiroNome]
FROM ASSOCIADO

-- exercício2
SELECT 
	nome, 
	datediff(YEAR, DataNascimento, getdate()) as Idade
FROM Associado

-- exercício3
SELECT
	nomeempregado as Nome,
	datediff(month, DataAdmissao, convert(date, '31/12/2000', 103)) as MesesTrabalhados
FROM Empregado
WHERE DataAdmissao between convert(date, '01/05/1980', 103)
	AND convert(date, '20/01/1982', 103);

-- exercício4
Select Top 1 Cargo
From Empregado
Group By Cargo
Order by count(1) desc

-- exercício5
Select Top 1 Nome
From Associado
Order by len(nome) desc

-- exercício6
Select Nome,
	dateadd(year, 50, DataNascimento) as DataDos50Anos,
	datename(dw,dateadd(year, 50, DataNascimento)) as DiaDaSemana
From Associado

-- exercício7
Select UF,
	count(1) as NumeroCidades
From Cidade
Group by UF;

-- exercício8
Select Distinct Nome, UF
From Cidade 
GROUP BY Nome, UF
HAVING count(Nome) > 1 and count(UF) > 1

-- exercício9
Select Top 1 IDAssociado + 1 as ProximoID
From Associado
Order by IDAssociado desc

-- exercício10
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
