

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ElfoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfoTest
{
    @Test
        public void elfoNasceComNomeInformado() {
                //Arrange
            String esperado = "Celeborn";
            //Act
            Elfo elfo = new Elfo(esperado);
            //Assert
            assertEquals (esperado, elfo.getNome());
        }
 
}
