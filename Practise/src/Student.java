
public class Student {

	private int id;
	private String name;
	private int marks;
	private Address addr;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", addr=" + addr + "]";
	}
	public Student(int id, String name, int marks, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	

	
}
