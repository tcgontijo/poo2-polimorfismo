package prodPlan;

public class Parafuso extends Parte {

	Float comprimento, diametro;

	public Parafuso(Integer cod, String nome, String descricao, Float valor, Float comprimento, Float diametro) {
		super(cod, nome, descricao, valor);
		this.comprimento = comprimento;
		this.diametro = diametro;
	}

	@Override
	Float calculaValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "codigo:" + cod + " nome:" + nome + " descricao:" + descricao + " valor:" + valor + " comprimento:"
				+ comprimento + " diamentro:" + diametro;
	}

}
