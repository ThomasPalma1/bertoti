package singletonpattern;

class Singleton {

	private static Singleton single_instance = null;

	public String singleton;

	private Singleton() {
		singleton = "Olá, eu sou a String que faz parte da classe Singleton!";
	}

	public static Singleton getInstance() {
		if (single_instance == null)
			single_instance = new Singleton();

		return single_instance;
	}
}
