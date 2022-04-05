package observerpattern;

import observerpattern.Magazine;
import observerpattern.NotifyAllEstados;

public class ApplicationObserver {
	public static void main(String[] args) {
		Magazine magazine = new Magazine();
		new NotifyAllEstados(magazine);
		magazine.setEstado("VEJA");
		System.out.println("\n=======================================================\n");
		magazine.setEstado("ESTADÃO");
	}
}