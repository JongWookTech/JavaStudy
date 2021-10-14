package studyobject;

public class Parents2 {
	String name;
	public Parents2(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Parents2타입의 객체name은 : " + name + "이다.";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parents2 other = (Parents2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
