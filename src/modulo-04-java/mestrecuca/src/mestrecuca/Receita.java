package mestrecuca;

import java.util.ArrayList;

public class Receita {
	public String nome;
	public ArrayList<Ingrediente> listaIngrediente = new ArrayList<>();
	public ArrayList<Instrucao> listaInstrucao = new ArrayList<>();
	
	public Receita(String nome){
		this.nome=nome;
	}
	
	public void adicionarIngrediente(Ingrediente ingrediente){
		this.listaIngrediente.add(ingrediente);
	}
	
	public void adicionarInstrucao(Instrucao instrucao){
		this.listaInstrucao.add(instrucao);
	}
	
	public double valorTotalReceita(){
		double valorTotal = 0;
		for(Ingrediente ingrediente: listaIngrediente){
			valorTotal += ingrediente.valor;
		}
		return valorTotal;
	}
}