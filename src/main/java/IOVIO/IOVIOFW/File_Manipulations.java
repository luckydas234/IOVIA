package IOVIO.IOVIOFW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Manipulations 
{
	public static void main(String[] args) throws IOException {
		write_file();
		read_file();
		
	}
	
	public static void write_file() throws IOException
	{
		FileOutputStream fos= new FileOutputStream("//Users//sulagnajee//api-workspace//IOVIOFW//abc.txt");
		
		String s="Hello how r u";
		byte[] array=s.getBytes();
		fos.write(array);
	}
	
	public static void read_file() throws IOException
	{
		FileInputStream fis=new FileInputStream("//Users//sulagnajee//api-workspace//IOVIOFW//abc.txt");
	
	int i=0;
	
	while(fis.read()!=-1)
	{
		System.out.println((char)fis.read());
	}
	
	}
	

}
