import java.io.*;
public class Employee1 implements Serializable {
private String name;
private String gender;
private Address address;

	public Employee1(String name, String gender) {
	super();
	this.name = name;
	this.gender = gender;
}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", gender=" + gender + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
