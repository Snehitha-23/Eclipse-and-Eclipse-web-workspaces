import java.io.*;
public class FileListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File files=new File("C:\\Users\\k74");
String filenames[]=files.list();
for(String filename :filenames)
	System.out.println(filename);
	}

}
