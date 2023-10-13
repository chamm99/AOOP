package singleton.vanilla;

class MyThread implements Runnable {
    public void run() {
        Singleton instance = Singleton.getInstance();
        instance.print();
        System.out.println("Singleton hashCode = " + instance.hashCode());
    }
} 

public class SingletonMain {
	static final int NUM_THREADS = 5;
	public static void main(String[] args) {
		Thread[] th = new Thread[NUM_THREADS];
		for (int i = 0; i < NUM_THREADS; i++) {
			th[i] = new Thread(new MyThread());
			th[i].start();
		}		
		for (Thread t : th) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
}
