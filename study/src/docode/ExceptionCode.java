package docode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("=======해보자 덧셈!=======");
				System.out.println("1. 더하기 2. 프로그램 종료");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.print("1번 정수를 입력하세요 : ");
					int num1 = sc.nextInt();
					System.out.print("2번 정수를 입력하세요 : ");
					int num2 = sc.nextInt();
					System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
					System.out.println("값의 타입이 옳지 않습니다.");
				case 2:
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			} catch (InputMismatchException ime) {
				System.out.println("값의 타입이 옳지 않습니다. 프로그램을 재구동 시켜주세요.");
				break;
			}
		}
	}
}
