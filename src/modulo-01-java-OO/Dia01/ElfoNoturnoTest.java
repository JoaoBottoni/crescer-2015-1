import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * Testes para classe ElfoNoturno.
 *
 */
public class ElfoNoturnoTest
{
    @Test
    public void quandoatirarFlechaUmaVez() {
        ElfoNoturno elfoNoturno = new ElfoNoturno("Will Smith");
        int experienciaEsperada = 3;
        elfoNoturno.atirarFlecha(new Orc());
        int experienciaObtida = elfoNoturno.getExperiencia();
        assertEquals(experienciaEsperada, experienciaObtida);
    }
    
    @Test
    public void quandoatirarFlechaDuasVezes() {
        ElfoNoturno elfoNoturno = new ElfoNoturno("Pericles");
        int experienciaEsperada = 6;
        elfoNoturno.atirarFlecha(new Orc());
        elfoNoturno.atirarFlecha(new Orc());
        int experienciaObtida = elfoNoturno.getExperiencia();
        assertEquals(experienciaEsperada, experienciaObtida);
    }
    
    @Test
    public void quandoatirarFlechaCincoVezes() {
        ElfoNoturno elfoNoturno = new ElfoNoturno("Naldo");
        int experienciaEsperada = 15;
        elfoNoturno.atirarFlecha(new Orc());
        elfoNoturno.atirarFlecha(new Orc());
        elfoNoturno.atirarFlecha(new Orc());
        elfoNoturno.atirarFlecha(new Orc());
        elfoNoturno.atirarFlecha(new Orc());
        int experienciaObtida = elfoNoturno.getExperiencia();
        assertEquals(experienciaEsperada, experienciaObtida);
    }
}