package mestrecuca;

public class ReceitaOuNomeNuloException extends RuntimeException {

	private static final long serialVersionUID = 607322997917085570L;

		public ReceitaOuNomeNuloException(){
			super("Receita e nome n�o podem ser nulos.");
		}
}