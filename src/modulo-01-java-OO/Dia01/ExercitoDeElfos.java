import java.util.*;
/**
 * Define objeto ExercitoDeElfos.
 * 
 */
public class ExercitoDeElfos
{    
    private HashMap<String,Elfo> alistados = new HashMap<>();
    public void alistarElfo(Elfo elfo){
        boolean elfoValido = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
        if(elfoValido){
            alistados.put (elfo.getNome(),elfo);
        }
    }
    
    public HashMap<String,Elfo> getExercito(){
        return this.alistados;
    }
    
    public Elfo buscar(String nome){
        return alistados.get(nome);
    }
}
