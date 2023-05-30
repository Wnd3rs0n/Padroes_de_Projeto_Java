package one_digitalinnovation.gof.singleton;

/**
 * Singleton "apressado".
 * @author Wanderson
 *
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
		
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
		
	}

}
