
/**
 * Write a description of class Orc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orc
{
        // instance variables - replace the example below with your own
    private int vida;
    /**
     * Constructor for objects of class Orc
     * 
     */
    public Orc()
    {  
        vida = 110;
    }
    /**
     * Orc perde 10 de vida ao levar flechada.
     */
    public void perdeVida() {
       vida=vida-10;
    }
   
}
