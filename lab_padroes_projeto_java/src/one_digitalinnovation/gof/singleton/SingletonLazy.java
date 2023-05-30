package one_digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso".
 * @author Wanderson
 *
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
		
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}	
		return instancia;
		
	}

}
