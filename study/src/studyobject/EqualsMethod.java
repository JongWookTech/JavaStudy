package studyobject;

public class EqualsMethod {
	public static void main(String[] args) {
		String name1 = "해보자코딩";
		String name2 = "해보자코딩";
		String name3 = "안한다고코딩";
		
		System.out.println(name1.equals("해보자코딩"));
		// name1의 문자열이 "해보자코딩"과 동일한가?
		System.out.println(name1.equals("안해요코딩"));
		// name1의 문자열이 "안해요코딩"과 동일한가?
		System.out.println(name1.equals(name2));
		// name1의 문자열이 name2의 값과 동일한가?
		System.out.println(name1.equals(name3));
		// name1의 문자열이 name3와 동일한가?
		
	}
}
