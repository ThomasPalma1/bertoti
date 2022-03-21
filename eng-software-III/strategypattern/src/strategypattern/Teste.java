package strategypattern;

public class Teste {

	public static void main(String[] args) {

		Cliente joao = new Cliente();

		joao.setFestival(new EntradaComum());
		joao.participarFestival();

		System.out.println("--------------------------------");

		joao.setFestival(new EntradaVIP());
		joao.participarFestival();

	}

}
