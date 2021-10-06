import java.io.*;
class Employee implements Serializable{
	private String name;
	private String gender;
	public Employee(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + "]";
	}
	
	
}
public class WritingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp1=new Employee("adf","male");
Employee emp2=new Employee("acf","male");
System.out.println(emp1);
System.out.println(emp2);
try {
	FileOutputStream fout=new FileOutputStream("C:\\snehitha");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeObject(emp1);
	out.writeObject(emp2);
	System.out.println("Objects are written");
	out.close();
	fout.close();
}catch(Exception e)
{
	System.out.println(e.getMessage());
}
	}

}
