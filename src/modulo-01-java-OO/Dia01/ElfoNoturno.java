import java.util.*;

/**
 * Define objetos ElfoNoturno
 * 
 */
public class ElfoNoturno extends Elfo
{

    {
        flechas = 42;
    }
    
    /**
     * Cria objetos ElfoNoturno
     * 
     * @param umNome Nome que o elfo receberá
     * @param flechas Quantidade inicial de flechas
     */
    public ElfoNoturno(String umNome, int flechas)
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
    public ElfoNoturno(String nome) {
        super(nome, 0);
    }
    
    public void atirarFlecha(Orc umOrc){
        super.atirarFlecha(umOrc);
        experiencia++;
        experiencia++;
        double vidaAPerder = vida*0.05;
        vida -= vidaAPerder;
        matarSeMereceMorrer();
    }
}