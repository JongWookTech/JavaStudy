package synchronizedTest;

public class MultiMain {
	public static void main(String[] args) {
		ThreadTest th1 = new ThreadTest();
		th1.start();
		ThreadTest th2 = new ThreadTest();
		th2.start();
		ThreadTest th3 = new ThreadTest();
		th3.start();
		ThreadTest th4 = new ThreadTest();
		th4.start();
		int a = 20;
		int b = 30;
		System.out.println("main 메소드에서의 작업 : " +(20+30));
		ThreadTest th5 = new ThreadTest();
		th5.start();
		ThreadTest th6 = new ThreadTest();
		th6.start();
		ThreadTest th7 = new ThreadTest();
		th7.start();
		ThreadTest th8 = new ThreadTest();
		th8.start();
	}
}
