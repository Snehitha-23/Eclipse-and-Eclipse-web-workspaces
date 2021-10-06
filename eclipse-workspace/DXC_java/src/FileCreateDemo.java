import java.io.*;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f=new File("C:\\Users\\k74\\OneDrive - DXC Production\\Documents\\20200722-DXC _ Java FSD Phase 1 _ Batch 1(167361186779632320)");
boolean status;
if(f.exists())
	System.out.println("File Exists");
else
{
	status=f.createNewFile();
	System.out.println((status==true)?"file created":"File not created");
}
	}

}
