
/**
 * Define objetos do tipo Orc
 * 
 * @author CWI Software
 */
public class Orc
{
    private int vida = 110;
    private String nome;
    private int experiencia = 0;
    private Status status;
    {
        //vida = 110;
        status = Status.VIVO;
    }
    
     /**
     * Construtor Orc com nome definido pelo usuário
     * 
     * @param nome Nome que o Orc receberá
     */
    public Orc(String nome) {
        this.nome = nome;
    }

   /**
    * 
    *Construtor Orc default
    */
   public Orc(){
     }
    /**
     * Construtor para objetos da classe Orc
    public Orc()
    {
        //vida = 110;
    }
    **/
    
    /**
     * Faz o Orc sofrer um ataque.
     * Atualmente 10 de dano será decrementado.
     */
    public void recebeAtaque() {
        this.vida -= 10;
        if(this.vida<=0){
            status = Status.MORTO;
        }
        // this.vida = this.vida - 10;
    }
    
    public int getVida() {
        return this.vida;
    }
    

    /**
     * Imprime a vida atual do Orc.
     * 
     * @return String com a vida atual do orc. Ex:
     * 
     * "Vida atual: 110"
     */
    public String toString() {
        return "Vida atual: " + this.vida;
    }
}