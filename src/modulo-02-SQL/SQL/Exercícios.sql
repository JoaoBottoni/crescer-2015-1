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