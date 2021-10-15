package generic;

public class GenericEx <T>{
	private T type;

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}

	<T>void typeof(){
		System.out.println("객체의 자료형 : " +type.getClass().getName().substring(10));
	}
	
}