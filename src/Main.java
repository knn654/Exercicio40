import java.util.concurrent.Semaphore;

public class Main {

	public static Semaphore semaforo;
	
	public static void main(String[] args) {
		
		int totalSaques = 1;
		int totalDepositos = 1;
		semaforo = new Semaphore(totalSaques);
		semaforo = new Semaphore(totalDepositos);
		
		for (int i = 0; i < totalSaques; i++) {
			Thread saques = new Threads(i, semaforo);
			saques.start();
		}
		
		for (int i = 0; i < totalDepositos; i++) {
			Thread depositos = new Threads(i, semaforo);
			depositos.start();
		}
	}
}