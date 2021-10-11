package objectOPs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
public static void main(String[] args) {
	/*file handling 
	 * -1 at end denote the ending of content of file
	 * string -->byte-->store-->byte-->string
	 * class involve in file handling are fileOutputStream and fileInputStream
	 * fileOutputStream -->create and write to the file
	 * fileInputStream-->read form the file
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	String data="ayush garg";
	try {
		FileOutputStream fos=new FileOutputStream("myfile.txt");
		byte[] byteData=data.getBytes();
		fos.write(byteData);
		System.out.println("done sir");
		fos.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		FileInputStream fis=new FileInputStream("myfile.txt");
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.print((char) i );
		}
		fis.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
