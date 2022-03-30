package singletonpattern;

public class SingletonDemo {

	public static void main(String args[]) {

		Singleton x = Singleton.getInstance();

		Singleton y = Singleton.getInstance();

		Singleton z = Singleton.getInstance();

		System.out.println("Hashcode de x é " + x.hashCode());
		System.out.println("Hashcode de y é " + y.hashCode());
		System.out.println("Hashcode de z é " + z.hashCode());

		if (x == y && y == z) {

			System.out.println("Três objetos apontam para o mesmo local");
		}

		else {
			System.out.println("\nOs três objetos não apontam para o mesmo local");
		}
	}

}
