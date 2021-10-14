package docode;

import java.util.IllegalFormatConversionException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sum sum = new Sum();
		try {
			sum.sum(12,"MYSOUL");
			// 강제로 NullPointerException 생성
		} catch (IllegalFormatConversionException e) {
			System.out.println("데이터 타입이 유효하지 않습니다.");
		}finally {
			System.out.println("해보자 코딩~");
		}
	}
}
