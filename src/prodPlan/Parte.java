package prodPlan;

public abstract class Parte {
	Integer cod;
	String nome, descricao;
	Float valor;
		
	public Parte(Integer cod, String nome, String descricao, Float valor) {
		this.cod = cod;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}

	abstract Float calculaValor();
	
	@Override
	public abstract String toString();
}
