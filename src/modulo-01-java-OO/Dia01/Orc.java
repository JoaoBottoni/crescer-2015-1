
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
    private Status status = Status.VIVO;
    private double j;
    {
        //vida = 110;
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
   
    private double gerarNumero() {
        double i = 0.0;
            if (this.nome != null && this.nome.length() > 5) {
                i += 65;
            }
            else {
                i -= 60;
            }
            
            if (this.vida >= 30 && this.vida <= 60){
                i = i*2;
            }
            else if (this.vida <20){
                i = i*3;
            }
            else{
            }
            
            if (status == status.FUGINDO){
                i = i/2;
            }
            else if (this.status == Status.CAÇANDO || this.status == Status.DORMINDO){
                i++;
            }
            else{
            }
            
            if (experiencia % 2 == 0){
                i = Math.pow(i,3);
            }
            else if (experiencia > 2){
                i = Math.pow(i,2);
            }
        
        return i;    
    }
    
    /**
     * Faz o Orc sofrer um ataque.
     * Chama o metodo gerarNumero() :
     * Se o número for menor que 0, o Orc ganha 2 de experiência e não recebe dano.
     * Se o número for maior ou igual a 0 e menor que 100, o Orc não recebe experiência nem dano.
     * Se o número for maior que 100, o Orc recebe 10 de dano.
     */
    public void recebeAtaque() {
        j=gerarNumero();
            if(j<0){
                experiencia+=2;
            }
            else{
                if(j>100){
                    this.vida-=10;
                }
            }
        
            if(this.vida<=0){
                status = Status.MORTO;
            }
            
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
