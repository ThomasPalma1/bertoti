package strategypattern;

public class Teste {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente();
		//	quero que o joao seja estudante -> tenha emprestimo comum
		joao.setFestival(new EntradaComum());
		joao.participarFestival();
		
		System.out.println("--------------------------------");
		
		//agora o joao criou uma empresa
		joao.setFestival(new EntradaVIP());
		joao.participarFestival();
		//note que as linhas 10 e 16 sao identicas, mas os comportamentos 
		//sao diferentes
		
	}
	
}
