import java.util.*;

class Sports extends Marks{
	private float score;
	private static Scanner sc=new Scanner(System.in);
	public void takeDetails() {
		System.out.println("Enter score :");
		this.score=sc.nextFloat();
	}
	public void showDetails() {
		System.out.println("Sports score :"+this.score);
	
	}
}
class Marks extends Student{
	
	private float score;
	//static Scanner sc=new Scanner(System.in);
	public void aDetails() {
		System.out.println("Enter score :");
		this.score=Student.sc.nextFloat();
	}
	public void bDetails() {
		System.out.println("Sports score :"+this.score);
	
	}
	
	
}
class Student{
	
	private float score;
	 static Scanner sc=new Scanner(System.in);
	public void acceptDetails() {
		System.out.println("Enter score :");
		this.score=Student.sc.nextFloat();
	}
	public void putDetails() {
		System.out.println("Sports score :"+this.score);
	
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sports obj=new Sports();
obj.acceptDetails();
obj.putDetails();
obj.takeDetails();
obj.showDetails();
obj.aDetails();
obj.bDetails();
	}

}
