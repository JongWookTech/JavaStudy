package docode;

public class Ferrari extends Car implements CarInfo{
	String carName = "뻬라리";

	public Ferrari(int maxspeed, double zeroback) {
		super(maxspeed, zeroback);
	}
	
	@Override
	void straight() {
		System.out.println(carName + "가 "+ zeroback + "초만에 시속" + maxspeed + "km의 속도로 달립니다.");
	}

	@Override
	void back() {
		System.out.println(carName + "이가 멈춥니다.");
	}
	
	@Override
	public String[] CarInfo() {
		String[] CarInfo = {carName, maxspeed+"", zeroback + ""};
		return CarInfo;
	}
}
