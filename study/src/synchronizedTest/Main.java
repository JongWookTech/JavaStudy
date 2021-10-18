package synchronizedTest;

public class Main {
	public static void main(String[] args) {
		RunnableTest run = new RunnableTest();
		
		Thread th1 = new Thread(run);
		th1.start();
		System.out.println();

 	}	
}
