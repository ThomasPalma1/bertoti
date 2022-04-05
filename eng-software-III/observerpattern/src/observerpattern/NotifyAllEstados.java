package observerpattern;

import observerpattern.Magazine;
import observerpattern.Observer;

public class NotifyAllEstados extends Observer {
	public NotifyAllEstados(Magazine estado) {
		this.estado = estado;
		this.estado.attach(this);
	}

	public void update() {
		System.out.println("Foi lançado uma nova revista, leia: " + this.estado.getEstado());
	}
}