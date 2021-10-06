import java.io.*;
import java.util.*;
public class CompanyFiles  {
	
	//ADDING A FILE
public static void AddFile(String path) throws IOException {
	System.out.println("Enter the filename to be created");
	Scanner scan=new Scanner(System.in);
	String filename=scan.next();
	
		File file=new File(path+"//"+filename);
	
	if(file.exists()&&file.getName().equals(filename)) {
		System.out.println("File already exists");
	}
	else {
		boolean status=file.createNewFile();
		if(status==true)
			System.out.println("File created");
		else
			System.out.println("File not created");
		
	}
}




//DELETING A FILE
public static void DeleteFile(String path)throws IOException {
	System.out.println("Enter the filename to be deleted");
	Scanner scan=new Scanner(System.in);
	String filename=scan.next();
	File file=new File(path+"//"+filename);
	if(file.exists()&&(file.getName()).equalsIgnoreCase(filename))
	{
	boolean status=file.delete();
	if(status==true)
		System.out.println("Deleted file successfully");
	}

else {
	System.out.println("File Not Found");
}
}




//SEARCHING A FILE
public static void searchFile(String path)throws IOException {
	System.out.println("Enter the filename to be searched");
	Scanner scan=new Scanner(System.in);
	String filename=scan.next();
	File file=new File(path+"//"+filename);
	System.out.println(file.getName());
	if(file.exists()&&file.getName().equalsIgnoreCase(filename))
	{
		System.out.println("File is found at ");
		System.out.println(file);
	}
	else
		System.out.println("File not found");
}
}	
