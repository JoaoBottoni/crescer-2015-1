

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**

 * A classe de teste OrcTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)

 */
public class OrcTest
{
    @Test
    public void orcNasceCom110Vida() {
        // Arrange - Montagem dos dados de teste
        Orc umOrc;
        // Act - Execução da ação de testes
        umOrc = new Orc();

        // Assert - Verificação
        int esperado = 110;
        int resultadoObtido = umOrc.getVida();
        
        assertEquals(esperado, resultadoObtido);
    }
    
    @Test
    public void orcRecebeAtaqueUmaVez() {
        //Arrange
        Orc umOrc = new Orc();
        //Act
        umOrc.recebeAtaque();
        
        //Assert
        int esperado = 100;
        int resultadoObtido = umOrc.getVida();
        
        assertEquals (esperado,resultadoObtido);
       
    }
     @Test
    public void orcRecebeAtaqueDuasVezes() {
        //Arrange
        Orc umOrc = new Orc();
        //Act
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        
        //Assert
        int esperado = 90;
        int resultadoObtido = umOrc.getVida();
        
        assertEquals (esperado,resultadoObtido);
       
    }
    @Test
    public void orcRecebeAtaqueCincoVezes() {
        //Arrange
        Orc umOrc = new Orc();
        //Act
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        
        //Assert
        int esperado = 60;
        int resultadoObtido = umOrc.getVida();
        
        assertEquals (esperado,resultadoObtido);
       
    }
    @Test
    public void orcRecebeAtaqueDozeVezes() {
        //Arrange
        Orc umOrc = new Orc();
        //Act
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        umOrc.recebeAtaque();
        
        //Assert
        int esperado = -10;
        int resultadoObtido = umOrc.getVida();
        
        assertEquals (esperado,resultadoObtido);
       
    }
}




