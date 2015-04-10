import java.util.*;

/**
 * Define objetos Elfo_Verde
 * 
 */
public class Elfo_Verde extends Elfo
{
    private int flechas;

    {
        flechas = 42;
    }
    
    /**
     * Cria objetos Elfo_Verde
     * 
     * @param umNome Nome que o elfo receberá
     * @param flechas Quantidade inicial de flechas
     */
    public Elfo_Verde(String umNome, int flechas)
    {
        this(umNome);
        // this.nome = nome;
        this.flechas = flechas;
    }
    
    /**
     * Cria um elfo informando nome.
     * 
     * @param nome Nome a ser dado para o Elfo.
     */
    public Elfo_Verde(String nome) {
        super(nome, 0);
    }
    
    /**
     * Atira uma flecha e perde uma unidade.
     * 
     * @param umOrc Orc que receberá uma flechada.
     */
    public void atirarFlecha(Orc umOrc) {
        //flechas = flechas - 1;
        flechas--;
        experiencia=experiencia+2;
        umOrc.recebeAtaque();
    }
}