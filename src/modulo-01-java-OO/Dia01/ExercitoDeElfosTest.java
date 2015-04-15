

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
/**
 * The test class ExercitoDeElfosTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExercitoDeElfosTest
{
    @Test
    public void adicionarUmElfoAoExercito() {
        // Arrange
        HashMap<String,Elfo> resultadoEsperado = new HashMap<>();
        HashMap<String,Elfo> resultadoObtido = new HashMap<>();
        // Act
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        ElfoNoturno elfon = new ElfoNoturno("Faustão");
        exercito.alistarElfo(elfon);
        resultadoEsperado.put (elfon.getNome(),elfon);
        resultadoObtido = exercito.getExercito();
        // Assert
        assertEquals(resultadoObtido, resultadoEsperado);
    }
    
    @Test
    public void adicionarUmElfoDeCadaTipoAoExercito() {
        // Arrange
        HashMap<String,Elfo> resultadoEsperado = new HashMap<>();
        HashMap<String,Elfo> resultadoObtido = new HashMap<>();
        // Act
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        ElfoNoturno elfon = new ElfoNoturno("Faustão");
        Elfo elfo = new Elfo("Faustão II");
        ElfoVerde elfov = new ElfoVerde("Faustão III");
        exercito.alistarElfo(elfon);
        exercito.alistarElfo(elfo);
        exercito.alistarElfo(elfov);
        resultadoEsperado.put (elfon.getNome(),elfon);
        resultadoEsperado.put (elfov.getNome(),elfov);
        resultadoObtido = exercito.getExercito();
        // Assert
        assertEquals(resultadoObtido, resultadoEsperado);
    }
}
