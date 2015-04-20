Select NomeEmpregado from Empregado
	Order by DataAdmissao

Select NomeEmpregado, (Salario*12) as SalarioAnual 
	from Empregado
	where Cargo = 'Atendente' 
	OR (Salario*12) < 18500

Select IDCidade 
from Cidade
where Nome = 'Uberlândia'

Select IDCidade, Nome 
from Cidade
where UF = 'RS'

Select count(IDEmpregado) as NumeroDeEmpregados from empregado;
Select * from Empregado;

Select count(1) as TotalEmpregados,
	count(Distinct Cargo) as TotalCargos
From Empregado;

SELECT COUNT(DISTINCT CARGO) FROM EMPREGADO;

SELECT IDDEPARTAMENTO,
	SUM(SALARIO) AS SOMA,
	MAX(SALARIO) AS MAXIMO,
	MIN(SALARIO) AS MINIMO
FROM EMPREGADO
GROUP BY IDDEPARTAMENTO;

Select NomeEmpregado,
	(Salario + Comissao) as Total_sal_a,
	(Salario + (ISNULL(Comissao,0))) as Total_sal_b,
	Comissao
From Empregado;

select * from Empregado
select * from associado

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



