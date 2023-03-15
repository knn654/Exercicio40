import java.util.concurrent.Semaphore;

public class Main {

	public static Semaphore semaforo;
	
	public static void main(String[] args) {
		
		int totalSaques = 1;
		int totalDepositos = 1;
		semaforo = new Semaphore(totalSaques);
		semaforo = new Semaphore(totalDepositos);
		
		int i = (int) (Math.random() * 20) + 1;
		int j = ((int) (Math.random() * 20) + 1) - i;

	}
}