
public class Address {

	private String homename;

	public String getHomename() {
		return homename;
	}

	public void setHomename(String homename) {
		this.homename = homename;
	}

	@Override
	public String toString() {
		return "Address [homename=" + homename + "]";
	}

	public Address(String homename) {
		super();
		this.homename = homename;
	}
	
}
