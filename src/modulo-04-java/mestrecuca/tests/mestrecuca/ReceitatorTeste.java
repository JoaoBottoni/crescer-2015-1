package mestrecuca;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ReceitatorTeste {
	@Test
	public void inserirUmaReceita() throws Exception {
		Receitator receitator = new Receitator();
		Ingrediente bife = new Ingrediente("bife",1,15,UnidadeMedida.UNIDADE);
		Instrucao assar = new Instrucao("Asse o bife.");
		Receita receita = new Receita("Bife Assado");
		receita.adicionarIngrediente(bife);
		receita.adicionarInstrucao(assar);
		receitator.inserir(receita);
		List<Receita> esperado = new ArrayList<>();
		esperado.add(receita);
		assertEquals(esperado,receitator.getTodasReceitas());
	}
	
	@Test
	public void inserirTresReceitas() throws Exception {
		Receitator receitator = new Receitator();
		Ingrediente bife = new Ingrediente("bife",1,15,UnidadeMedida.UNIDADE);
		Instrucao assar = new Instrucao("Asse o bife.");
		Receita receita = new Receita("Bife Assado");
		receita.adicionarIngrediente(bife);
		receita.adicionarInstrucao(assar);
		Ingrediente bife1 = new Ingrediente("bife",1,15,UnidadeMedida.UNIDADE);
		Instrucao assar1 = new Instrucao("Asse o bife.");
		Receita receita1 = new Receita("Bife Assado");
		receita1.adicionarIngrediente(bife1);
		receita1.adicionarInstrucao(assar1);
		Ingrediente ovo = new Ingrediente("ovo",200,15,UnidadeMedida.GRAMA);
		Instrucao quebrar = new Instrucao("Quebre o ovo.");
		Receita receita2 = new Receita("Ovo quebrado.");
		receita2.adicionarIngrediente(ovo);
		receita2.adicionarInstrucao(quebrar);
		receitator.inserir(receita);
		receitator.inserir(receita1);
		receitator.inserir(receita2);
		List<Receita> esperado = new ArrayList<>();
		esperado.add(receita);
		esperado.add(receita1);
		esperado.add(receita2);
		assertEquals(esperado,receitator.getTodasReceitas());
	}
	
	@Test(expected=ReceitaOuNomeNuloException.class)
	public void inserirUmaReceitaNula() throws Exception {
		Receitator receitator = new Receitator();
		Receita receita = new Receita("Bife Assado");
		receitator.inserir(receita);
	}
	
	@Test
	public void atualizarReceita() throws Exception {
		Receitator receitator = new Receitator();
		Ingrediente bife = new Ingrediente("bife",1,15,UnidadeMedida.UNIDADE);
		Instrucao assar = new Instrucao("Asse o bife.");
		Receita receita = new Receita("Bife Assado");
		receita.adicionarIngrediente(bife);
		receita.adicionarInstrucao(assar);
		Ingrediente bife1 = new Ingrediente("bife",1,15,UnidadeMedida.UNIDADE);
		Instrucao assar1 = new Instrucao("Asse o bife.");
		Receita receita1 = new Receita("Bife Assado");
		receita1.adicionarIngrediente(bife1);
		receita1.adicionarInstrucao(assar1);
		receitator.inserir(receita);
		List<Receita> esperado = new ArrayList<>();
		esperado.add(receita1);
		receitator.atualizar("Bife Assado", receita1);
		assertEquals(esperado,receitator.getTodasReceitas());
	}
	
	@Test(expected=ReceitaOuNomeNuloException.class)
	public void atualizarUsandoReceitaNula() throws Exception {
		Receitator receitator = new Receitator();
		Ingrediente oleo = new Ingrediente("�leo",200,15,UnidadeMedida.GRAMA);
		Instrucao espalhar = new Instrucao("Espalhe o �leo.");
		Receita receita2 = new Receita("�leo Espalhado");
		receita2.adicionarIngrediente(oleo);
		receita2.adicionarInstrucao(espalhar);
		receitator.inserir(receita2);
		Receita receita = new Receita("Bife Assado");
		receitator.atualizar("�leo Espalhado", receita);
	}
	
	@Test(expected=NomeInvalidoException.class)
	public void atualizarUsandoNomeInvalido() throws Exception {
		Receitator receitator = new Receitator();
		Ingrediente oleo = new Ingrediente("�leo",200,15,UnidadeMedida.GRAMA);
		Instrucao espalhar = new Instrucao("Espalhe o �leo.");
		Receita receita2 = new Receita("�leo Espalhado");
		receita2.adicionarIngrediente(oleo);
		receita2.adicionarInstrucao(espalhar);
		receitator.inserir(receita2);
		receitator.atualizar("aleatorio", receita2);
	}
	
	@Test
	public void excluirReceita() throws Exception {
		Receitator receitator = new Receitator();
		Ingrediente bergamota = new Ingrediente("bergamota",200,15,UnidadeMedida.GRAMA);
		Instrucao descascar = new Instrucao("Descasque a bergamota.");
		Receita receita2 = new Receita("Bergamota Descascada");
		receita2.adicionarIngrediente(bergamota);
		receita2.adicionarInstrucao(descascar);
		receitator.inserir(receita2);
		receitator.excluir("Bergamota Descascada");
		List<Receita> esperado = new ArrayList<>();
		assertEquals(esperado,receitator.getTodasReceitas());
	}
	
	@Test(expected=NomeInvalidoException.class)
	public void excluirReceitaUsandoNomeInvalido() throws Exception {
		Receitator receitator = new Receitator();
		Ingrediente agua = new Ingrediente("�gua",200,15,UnidadeMedida.GRAMA);
		Instrucao ferver = new Instrucao("Ferva a �gua.");
		Receita receita2 = new Receita("�gua fervida");
		receita2.adicionarIngrediente(agua);
		receita2.adicionarInstrucao(ferver);
		receitator.inserir(receita2);
		receitator.excluir("aleatorio2");
	}

	
	@Test
	public void buscarReceitaPeloNome() throws Exception {
		Receitator receitator = new Receitator();
		Ingrediente mate = new Ingrediente("Erva Mate",200,15,UnidadeMedida.GRAMA);
		Instrucao preparar = new Instrucao("Prepare o mate.");
		Receita receita2 = new Receita("Chimarr�o");
		receita2.adicionarIngrediente(mate);
		receita2.adicionarInstrucao(preparar);
		receitator.inserir(receita2);
		assertEquals(receita2,receitator.buscaReceitaPeloNome("Chimarr�o"));
	}
	
	@Test(expected=NomeInvalidoException.class)
	public void buscarReceitaPeloNomeUsandoNomeInvalido() throws Exception {
		Receitator receitator = new Receitator();
		Ingrediente mate = new Ingrediente("Erva mate",200,15,UnidadeMedida.GRAMA);
		Instrucao preparar = new Instrucao("Prepare um mate bem amargo.");
		Receita receita2 = new Receita("Mate amargo");
		receita2.adicionarIngrediente(mate);
		receita2.adicionarInstrucao(preparar);
		receitator.inserir(receita2);
		receitator.buscaReceitaPeloNome("aleatorio3");
	}
	
}
