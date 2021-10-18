package synchronizedTest;

public class ThreadTest extends Thread {
	@Override
	public void run() {
		Thread threadName = Thread.currentThread();
		String name = threadName.getName();
		System.out.println("현재 Thread의 이름 : " + name);
	}
}
