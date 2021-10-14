package algorithm;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 몇 개나 생성하시겠어요? : ");
		//입력받은 값만큼의 Index를 가진 배열을 하나 생성한다.
		int count = sc.nextInt();
		int max = 0;
		int min = 0;
		int[] num = new int[count];
		for (int i = 0; i < num.length; i++) {
			System.out.print(i + "번째 값 : ");
			num[i] = sc.nextInt();
			if(num[i] > max) max = num[i];
			if(i == 0) min = num[i];
			if(num[i] < min) min = num[i];
		}

		System.out.println("가장 큰 수는 " + max +"이다");
		System.out.println("가장 작은 수는" + min +"이다.");
	}
}
