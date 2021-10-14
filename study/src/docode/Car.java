package docode;


public abstract class Car{
//접근제어자 abstract class 클래스명
	int maxspeed;
	double zeroback;
	
	public Car(int maxspeed, double zeroback){
			this.maxspeed = maxspeed;
			this.zeroback = zeroback;			
	}
	
	abstract void straight();
	// 앞으로 가기
	abstract void back();
	// 뒤로 가기
	
	}
 