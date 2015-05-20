package mestrecuca;

import java.util.ArrayList;
import java.util.List;

public class Receitator  implements LivroReceitas {
	private List<Receita> listaReceitas = new ArrayList<>();
	
	public void inserir(Receita receita){
		if(receita.nome.isEmpty()||receita.listaIngrediente.isEmpty()||receita.listaInstrucao.isEmpty()){
			throw new ReceitaOuNomeNuloException();
		} 
		else{
				listaReceitas.add(receita);
		}
	}
	
	public void atualizar(String nome, Receita receitaAtualizada){
		if(receitaAtualizada.nome.isEmpty()||receitaAtualizada.listaIngrediente.isEmpty()||receitaAtualizada.listaInstrucao.isEmpty()){
			throw new ReceitaOuNomeNuloException();
		} 
		else{
			for(int i=0;i<listaReceitas.size();i++){
				if(listaReceitas.get(i).nome == nome){
					listaReceitas.set(i, receitaAtualizada);
					return;
				}
			}
			}
		throw new NomeInvalidoException(); 
	}
	
	public void excluir (String nome){
		for(int i=0;i<listaReceitas.size();i++){
			if(listaReceitas.get(i).nome == nome){
				listaReceitas.remove(i);
				return;
			}
		}
		throw new NomeInvalidoException();
	}
	
	public List<Receita> getTodasReceitas(){
		return listaReceitas;
	}
	
	public Receita buscaReceitaPeloNome(String nome){
		for(int i=0;i<listaReceitas.size();i++){
			if(listaReceitas.get(i).nome == nome){
				return listaReceitas.get(i);
			}
		}
		throw new NomeInvalidoException();
	}
	
	public double calcularValorReceitas(List<Receita> listaDeReceitas){
		double valor = 0;
		for(Receita receita: listaDeReceitas){
			valor += receita.valorTotalReceita();
		}
		return valor;
	}
	
	public List<Receita> protegerAlergicos(List<Ingrediente> listaIngredientesAlergicos){
		List<Receita> seguras = new ArrayList<>();
		for(Ingrediente ingrediente: listaIngredientesAlergicos){
			for(Receita receita: listaReceitas){
				if(receita.listaIngrediente.indexOf(ingrediente)==-1){
					seguras.add(receita);
				}
			}
		}
		return seguras;
	}
	
}
