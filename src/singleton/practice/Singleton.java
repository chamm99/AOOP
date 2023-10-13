package singleton.practice;

public class Singleton {

	private static Singleton instance = null;
	
	private Singleton() {
		System.out.println("Singleton constructor");
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
        }
		return instance;
	}
	
	public void print() {
		System.out.println("Singleton instance hashCode = " + instance.hashCode());
	}
}
