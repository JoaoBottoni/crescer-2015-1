package mestrecuca;

public class NomeInvalidoException extends RuntimeException{
	
	private static final long serialVersionUID = 3152362713219960816L;

	public NomeInvalidoException(){
		super("Nome não encontrado");
	}
}