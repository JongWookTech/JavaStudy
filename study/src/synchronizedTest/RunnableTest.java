package synchronizedTest;

public class RunnableTest implements Runnable{
	@Override
	public void run() {
		Thread threadName = new Thread();
		String name = threadName.getName(); 
		System.out.println("현재 Thread의 이름 : " + name);
	}	
}
