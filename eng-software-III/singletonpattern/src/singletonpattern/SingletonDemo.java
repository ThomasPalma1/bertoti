package singletonpattern;

public class SingletonDemo {

	public static void main(String args[]) {

		Singleton x = Singleton.getInstance();

		Singleton y = Singleton.getInstance();

		Singleton z = Singleton.getInstance();

		System.out.println("Hashcode de x � " + x.hashCode());
		System.out.println("Hashcode de y � " + y.hashCode());
		System.out.println("Hashcode de z � " + z.hashCode());

		if (x == y && y == z) {

			System.out.println("Tr�s objetos apontam para o mesmo local");
		}

		else {
			System.out.println("\nOs tr�s objetos n�o apontam para o mesmo local");
		}
	}

}
