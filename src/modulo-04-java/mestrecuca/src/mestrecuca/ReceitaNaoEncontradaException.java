package mestrecuca;

public class ReceitaNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = 6085875163043539436L;

	public ReceitaNaoEncontradaException(){
		super("Receita Não Encontrada");
	}
}
