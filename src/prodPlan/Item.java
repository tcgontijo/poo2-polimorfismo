package prodPlan;

public class Item {
	Parte parte;
	Integer quantidade;

	public Item(Parte parte, Integer quantidade) {
		this.parte = parte;
		this.quantidade = quantidade;
	}

	public Float calculaValor() {
		return parte.valor * quantidade;
	}

	@Override
	public String toString() {
		return "cod:" + parte.cod + " nome:" + parte.nome + " quantidade:" + quantidade + " valor unitario:"
				+ parte.valor + " valor:" + calculaValor();
	}

}
