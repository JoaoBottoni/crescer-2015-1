import java.util.*;

/**
 * Define objetos Elfo_Verde
 * 
 */
public class ElfoVerde extends Elfo
{
    {
        flechas = 42;
    }    
        private final String[] ITENS_PERMITIDOS = new String[] {
        "Espada de Aço Valiriano",
        "Arco e Flecha de Vidro"
    };
    
    /**
     * Cria objetos ElfoVerde
     * 
     * @param umNome Nome que o elfo receberá
     * @param flechas Quantidade inicial de flechas
     */
    public ElfoVerde(String umNome, int flechas)
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
    public ElfoVerde(String nome) {
        super(nome, 0);
    }
    
    public void atirarFlecha(Orc umOrc){
        super.atirarFlecha(umOrc);
        experiencia++;
    }
    
    public void adicionarItem(ItemDoInventario item) {
        boolean descricaoValida = item != null && Arrays.asList(ITENS_PERMITIDOS).contains(item.getDescricao());

        if (descricaoValida) {
            super.adicionarItem(item);
        }
    }
}