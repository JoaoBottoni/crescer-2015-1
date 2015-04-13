import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * Testes para classe ElfoVerde.
 *
 */
public class ElfoVerdeTest
{
    @Test
    public void quandoatirarFlechaGanha2DeExperiencia() {
        ElfoVerde elfoVerde = new ElfoVerde("Elfo Slime");
        int experienciaEsperada = 2;
        elfoVerde.atirarFlecha(new Orc());
        int experienciaObtida = elfoVerde.getExperiencia();
        assertEquals(experienciaEsperada, experienciaObtida);
    }

    @Test
    public void quandoatirarFlechaDuasVezesGanha4() {
        ElfoVerde elfoVerde = new ElfoVerde("Link, Pericles");
        int experienciaEsperada = 4;
        elfoVerde.atirarFlecha(new Orc());
        elfoVerde.atirarFlecha(new Orc());
        int experienciaObtida = elfoVerde.getExperiencia();
        assertEquals(experienciaEsperada, experienciaObtida);
    }

    @Test
    public void quandoatirarFlechaCincoVezesGanha10() {
        ElfoVerde elfoVerde = new ElfoVerde("allgreen");
        int experienciaEsperada = 10;
        elfoVerde.atirarFlecha(new Orc());
        elfoVerde.atirarFlecha(new Orc());
        elfoVerde.atirarFlecha(new Orc());
        elfoVerde.atirarFlecha(new Orc());
        elfoVerde.atirarFlecha(new Orc());
        int experienciaObtida = elfoVerde.getExperiencia();
        assertEquals(experienciaEsperada, experienciaObtida);
    }

    @Test
    public void quandoAdicionaItemNulo() {
        ElfoVerde elfoVerde = new ElfoVerde("Link");
        ArrayList<ItemDoInventario> inventarioEsperado = new ArrayList<ItemDoInventario>();
        elfoVerde.adicionarItem(null);
        ArrayList<ItemDoInventario> inventarioObtido = elfoVerde.getItens();
        assertEquals(inventarioEsperado, inventarioObtido);
    }
    
    @Test
    public void quandoAdicionaItemComDescricaoInvalida() {
        ElfoVerde elfoVerde = new ElfoVerde("Link");
        ArrayList<ItemDoInventario> inventarioEsperado = new ArrayList<ItemDoInventario>();
        elfoVerde.adicionarItem(new ItemDoInventario(1, "Master Sword"));
        ArrayList<ItemDoInventario> inventarioObtido = elfoVerde.getItens();
        assertEquals(inventarioEsperado, inventarioObtido);
    }

    @Test
    public void quandoAdicionaUmItemComDescricaoValida() {
        ElfoVerde elfoVerde = new ElfoVerde("Link");
        ArrayList<ItemDoInventario> inventarioEsperado = new ArrayList<ItemDoInventario>();
        ItemDoInventario espadaValiriana = new ItemDoInventario(1, "Espada de Aço Valiriano");
        inventarioEsperado.add(espadaValiriana);
        elfoVerde.adicionarItem(espadaValiriana);
        ArrayList<ItemDoInventario> inventarioObtido = elfoVerde.getItens();
        assertEquals(inventarioEsperado, inventarioObtido);
    }

    @Test
    public void quandoAdicionaDoisItensComDescricaoValida() {
        ElfoVerde elfoVerde = new ElfoVerde("Link");
        ArrayList<ItemDoInventario> inventarioEsperado = new ArrayList<ItemDoInventario>();
        ItemDoInventario espadaValiriana = new ItemDoInventario(1, "Espada de Aço Valiriano");
        ItemDoInventario arcoEFlechaVidro = new ItemDoInventario(2, "Arco e Flecha de Vidro");
        inventarioEsperado.add(espadaValiriana);
        inventarioEsperado.add(arcoEFlechaVidro);
        elfoVerde.adicionarItem(espadaValiriana);
        elfoVerde.adicionarItem(new ItemDoInventario(2, "Hookshot"));
        elfoVerde.adicionarItem(arcoEFlechaVidro);
        ArrayList<ItemDoInventario> inventarioObtido = elfoVerde.getItens();
        assertEquals(inventarioEsperado, inventarioObtido);
    }
}