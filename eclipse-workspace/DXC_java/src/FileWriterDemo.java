import java.io.*;
public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(FileWriter w=new FileWriter("C:\\Users\\k74\\OneDrive - DXC Production\\Pictures\\Saved Pictures")){
w.write("snehitha");

}catch(IOException e) {
System.out.println(e.getMessage());
	}

}
}