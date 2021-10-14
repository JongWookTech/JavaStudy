package studyobject;

public class Parents {
	String name;

	public Parents(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Parents타입의 객체name은 : " + name + "이다.";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parents other = (Parents) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
