package docode;

import java.util.IllegalFormatConversionException;

public class Sum {

	public void sum(int num1, String num2) throws IllegalFormatConversionException {
		try {
			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		}catch (IllegalFormatConversionException e) {
			System.out.println("에러가 신나요");
			throw e;
		}
	}
}
