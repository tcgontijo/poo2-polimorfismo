package prodPlan;

public class Teste {

	static Parte[] criaPartes() {
		Parte[] partes = new Parte[8];
		partes[0] = new Motor(112, "motor m112", "motor de avanco do cabecote", 100.0F, 1.2F, 1.1F, 1250);
		partes[1] = new Motor(114, "motor m114", "motor auxiliar", 60.0F, 0.6F, 0.8F, 1250);
		partes[2] = new Motor(111, "motor m111", "motor de ventilador", 70.0F, 1.0F, 1.0F, 3000);
		partes[3] = new Motor(110, "motor m110", "motor principal", 120.0F, 1.8F, 1.5F, 1250);
		partes[4] = new Parafuso(231, "parafuso p1", "parafuso de fixacao do cabecote", 2.5F, 100.0F, 8.0F);
		partes[5] = new Parafuso(232, "parafuso p2", "parafuso de fixacao do motor", 2.5F, 80.0F, 6.0F);
		partes[6] = new Parafuso(233, "parafuso p3", "parafuso de fixacao do ventilador", 2.0F, 60.0F, 6.0F);
		partes[7] = new Parafuso(234, "parafuso p4", "parafuso de uso geral", 3.0F, 120.0F, 12.0F);
		return partes;
	}

	static Item[] criaItens(Parte[] partes) {
		Item[] itens = new Item[4];
		itens[0] = new Item(partes[0], 10);
		itens[1] = new Item(partes[5], 50);
		itens[2] = new Item(partes[7], 30);
		itens[3] = new Item(partes[2], 5);
		return itens;
	}

	static void listaPartes(String titulo, Parte[] partes) {
		System.out.println(titulo);
		for (Parte parte : partes) {
			System.out.println(parte.toString());
		}
		System.out.println();
	}

	static void listaItens(String titulo, Item[] itens) {
		System.out.println(titulo);
		for (Item item : itens) {
			System.out.println(item.toString());
		}
		System.out.println("Valor total:" + valorTotal(itens) + "\n");
	}

	static Float valorTotal(Item[] itens) {
		Float valorTotal = 0.0F;
		for (Item item : itens) {
			valorTotal += item.calculaValor();
		}
		return valorTotal;
	}

	public static void main(String[] args) {
		Parte[] partes = criaPartes();
		Item[] itens = criaItens(partes);
		listaPartes("*** Partes utilizadas na producao ****", partes);
		listaItens("*** Itens solicitados ***", itens);
	}

}
