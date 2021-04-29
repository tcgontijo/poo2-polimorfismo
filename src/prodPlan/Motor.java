package prodPlan;

public class Motor extends Parte {

	Float potencia, corrente;
	Integer rpm;

	public Motor(Integer cod, String nome, String descricao, Float valor, Float potencia, Float corrente, Integer rpm) {
		super(cod, nome, descricao, valor);
		this.potencia = potencia;
		this.corrente = corrente;
		this.rpm = rpm;
	}

	@Override
	Float calculaValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "codigo:" + cod + " nome:" + nome + " descricao:" + descricao + " valor:" + valor + " potencia:"
				+ potencia + " corrente:" + corrente + " rpm:" + rpm;
	}

}
