package docode;

public class Drive {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari(300, 6.5);
		ferrari.straight();
		ferrari.back();
		String[] carInfo = ferrari.CarInfo();
		for (int i = 0; i < carInfo.length; i++) {
			System.out.println("carInfo의 "+i+"번 방 : "+ carInfo[i]);
		}
		System.out.println("=============================================");
		Lamborgini lambo = new Lamborgini(350, 7.9);
		lambo.straight();
		lambo.back();
		carInfo = lambo.CarInfo();
		for (int i = 0; i < carInfo.length; i++) {
			System.out.println("carInfo의 "+i+"번 방 : "+ carInfo[i]);
		}
		System.out.println("=============================================");
		Avante avan = new Avante(150, 12.5);
		avan.straight();
		avan.back();
		carInfo = avan.CarInfo();
		for (int i = 0; i < carInfo.length; i++) {
			System.out.println("carInfo의 "+i+"번 방 : "+ carInfo[i]);
		}
	}
}
