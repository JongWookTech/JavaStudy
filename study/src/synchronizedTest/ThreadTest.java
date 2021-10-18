package synchronizedTest;

public class ThreadTest extends Thread {
	@Override
	public void run() {
		int a = 10;
		int b = 23;
		System.out.println(getName() + " 작업 결과 : " + (a+b));
	}
}
