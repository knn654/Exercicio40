import java.util.concurrent.Semaphore;

public class Threads extends Thread {
	
	private int transacao;
	private Semaphore semaforo;
	
	public Threads(int transacao, Semaphore semaforo) {
		this.transacao = transacao;
		this.semaforo = semaforo;
	}
}