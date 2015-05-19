package filmator;

public enum Genero {

	COMEDIA("Com�dia"),
	DRAMA("Drama"),
	ACAO("A��o");
	
	private String descricao;

	private Genero(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return this.getDescricao();
	}
}