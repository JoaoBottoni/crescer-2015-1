package mestrecuca;

public class ReceitaNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = 3551133500424603427L;

	public ReceitaNaoEncontradaException(String nome){
		super(String.format("Receita %s não encontada", nome));
	}
}