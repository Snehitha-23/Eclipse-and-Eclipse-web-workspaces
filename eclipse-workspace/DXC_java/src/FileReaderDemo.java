import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try(FileReader reader=new FileReader("C:\\Users\\k74\\OneDrive")){
	int i;
	while((i=reader.read())!=-1) {
		System.out.println((char)i);
	}
}
 catch(IOException ex) {
 System.out.println(ex.getMessage());
	}
	}
}
