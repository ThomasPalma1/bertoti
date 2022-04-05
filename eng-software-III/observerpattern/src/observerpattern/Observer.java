package observerpattern;

import observerpattern.Magazine;

public abstract class Observer {
	protected Magazine estado;

	public abstract void update();
}