package generic;

public class Main {
	public static void main(String[] args) {
		GenericEx<String> generic1 = new GenericEx<String>();
		generic1.setType("해보자 코딩");
		
		GenericEx<Integer> generic2 = new GenericEx<Integer>();
		generic2.setType(123);
		
		GenericEx<Boolean> generic3 = new GenericEx<Boolean>();
		generic3.setType(true);
		generic1.typeof();
		generic2.typeof();
		generic3.typeof();
	}
}
