import java.util.*;
import java.io.*;
public class CompanyLockers {

	public static void main(String[] args) throws IOException {
		System.out.println("--------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println( "-------------------------------- WELCOME TO LOCKME.COM ----------------------------------------");
		System.out.println("Developer:Katakam Snehitha------------------------------------------------------------");
		System.out.println("Company:DXC Technologies-------------------------------------------------");
		
		//For new users to register
		System.out.println("---------------------------------------------------------------");
		System.out.println("================================================================================================================================");
		System.out.println("CHOOSE 1 FOR NEW USERS AND 2 FOR REGISTERED USERS");
		System.out.println("1.REGISTRATION");
		//For already registered users to login into their account
				System.out.println("2.LOGIN IN");
		Scanner sc=new Scanner(System.in);
		if(sc.nextInt()==1)
		{
			System.out.println("Opening registeration page...");
			registeration();
		}
		else {
			System.out.println("================================================================================================================================");
			System.out.println("                                                  LOGIN PAGE                                                                    ");
			System.out.println("================================================================================================================================");

			System.out.println("Username:");
			String username=sc.next();
			System.out.println("Password:");
			String password=sc.next();
			 loginVerify(username,password);
			
		}
	}
	
	
	
	
	
	static Map<String,String> loginmap =new HashMap<String,String>();
		public static void loginVerify(String username, String password) throws IOException {
	boolean verify=false;
	Scanner sc=new Scanner(System.in);
	if(loginmap.containsKey(username)) {
		
		if(loginmap.containsValue(password)) {
			verify=true;
			}
		}
	if(verify==true) {
		System.out.println("Login successful");
	System.out.println("====================================WELCOME   "+username.toUpperCase()+"================================================");
	directory(username);
	
	}
	
	else
	{
		System.out.println("Invalid Username or password");
		System.out.println("Username:");
		String username1=sc.next();
		System.out.println("Enter Password:");
		String password1=sc.next();
		loginVerify(username1,password1);
	}
}
		
		
		
		
		
		
		
	private static void directory(String username) throws IOException {	
	String path=username;
	File filedir=new File("C:\\snehitha\\LockerFiles\\"+path);
	path="C:\\snehitha\\LockerFiles\\"+path;
	boolean bool=filedir.mkdir();
	if(bool)
System.out.println("Directory created successfully");
	else
		System.out.println("Directory creation failed");
		int choose;
	Scanner sc=new Scanner(System.in);
	do {
		System.out.println("                                                                                        ");
System.out.println("                         YOU MAY SELECT ANY OPTION FROM BELOW MENU                           ");
System.out.println("1.To display the files 2.Adding a file  3.To search a file  4.To delete a file  ");
int a=sc.nextInt();
switch(a) {
case 1:
	List listfile=Arrays.asList(filedir.list());
	Collections.sort(listfile);
	if(listfile.isEmpty())
		System.out.println("No files to display");
	else
	System.out.println(listfile);
	break;
case 2:
	CompanyFiles.AddFile(path);
       break;

case 3:
	CompanyFiles.searchFile(path);
	break;
	
case 4:
	CompanyFiles.DeleteFile(path);
       break;
	
default:	
	System.out.println("Enter the right choice");
	break;
	
}
System.out.println("Enter your choice");
System.out.println("1.Exit the application   2.Back to menu");
choose=sc.nextInt();
	}while(choose==2);
	if(choose==1)
System.out.println("------------------APPLICATION CLOSED--------------------------------");
	else
		System.out.println("Enter right choice");
	}

	


	
		public static void registeration() throws IOException {
  
		System.out.println("===========================================================================================================");
		System.out.println( "                                       REGISTERATION PAGE                                                  ");
		System.out.println("===========================================================================================================");
		

      	System.out.println("INSTRUCTIONS:");
		System.out.println("User name: user name should have minimum of eight letters in lowercase");
		System.out.println("Password: password must be eight charcaters long and must contain one capital letter,number,special character.");
		userDetails();
		}
		
		
	 private static void userDetails() throws IOException {
			// TODO Auto-generated method stub
		    boolean check;
			do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Username:");
			String username=sc.next();
			System.out.println("Enter Password:");
			String password=sc.next();
			System.out.println("--------------------------   Validating the inputs   ---------------------");
		    check=validation(username,password);
			}while(check==false);
				  
		}

	 
	 
	 
	static boolean validation(String username,String password) throws IOException {
		boolean valid=true;
		if(username.length()!=8) {
	        	System.out.println("username must be eight characters in length");
	        	valid=false;
	        }
		if(password.length()!=8)
		{
			System.out.println("Password should be eight characters in length");
			valid=false;
		}
		String upperCaseChars="(.*[A-Z].*)";
		if(!password.matches(upperCaseChars)) {
		System.out.println("Password must contain a UPPER CASE letter");	
		valid=false;
		}
		 String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers))
        {
                System.out.println("Password should contain atleast one number.");
                valid = false;
        }
        String specialChars = "(.*[,~,!,@,#,$,%,^,&,,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*)";
        if (!password.matches(specialChars))
        {
                System.out.println("Password should contain atleast one special character");
                valid = false;
        }
        
        if (valid)
        {
        	
        	if(loginmap.containsKey(username)) {
        		System.out.println("That username is already used");
        	userDetails();
        	}
        	loginmap.put(username, password);
                System.out.println("REGISTRATION SUCCESSFUL");
                System.out.println("LOGIN");
                //after successful registration to login into their account
                Scanner sc=new Scanner(System.in);
                System.out.println("Username:");
                String name=sc.next();
                System.out.println("Password:");
    			String pass=sc.next();
    			 loginVerify(name,pass);
    			 return valid;
        }
        else
        {
        	return valid;
        }
	}

	
	 

}
