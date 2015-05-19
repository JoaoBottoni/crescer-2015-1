package filmator;

import static org.junit.Assert.*;

import org.junit.Test;

public class NetfloxTest {

	
	@Test
	public void reproduzFilmeDeveIncrementerEstatisticas() throws Exception {
		
		// Arrange
		Netflox netflox = new Netflox();
		assistirDoisFilmesDeAcaoUmDeDrama(netflox);
		
		// Assert
		assertTrue("Deve ter coletado estat�sticas de drama", netflox.getEstatisticasPorGenero().containsKey(Genero.DRAMA));
		assertTrue("Deve ter coletado estat�sticas de a��o", netflox.getEstatisticasPorGenero().containsKey(Genero.ACAO));
		
		assertEquals("Deve ter coletado estat�sticas de a��o", netflox.getEstatisticasPorGenero().get(Genero.ACAO), new Integer(2));
		assertEquals("Deve ter coletado estat�sticas de drama", netflox.getEstatisticasPorGenero().get(Genero.DRAMA), new Integer(1));	
	}
	
	@Test
	public void geraRelatorio() throws Exception {
		Netflox netflox = new Netflox();
		assistirDoisFilmesDeAcaoUmDeDrama(netflox);
		
		// Assert
		assertTrue("Deve ter gerado relat�rio de a��o", netflox.geraRelatorio().contains("A��o: 2"));
		assertTrue("Deve ter gerado relat�rio de drama", netflox.geraRelatorio().contains("Drama: 1"));
	}
	

	private Netflox assistirDoisFilmesDeAcaoUmDeDrama(Netflox netflox) {
		Filme acao = new Filme("O poderoso chef�o", Genero.ACAO);
		Filme drama = new Filme("Titanic", Genero.DRAMA);
		
		// Act
		netflox.reproduzirFilme(acao);
		netflox.reproduzirFilme(acao);
		netflox.reproduzirFilme(drama);
		return netflox;
	}
}