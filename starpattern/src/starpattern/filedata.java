package starpattern;

import java.io.*;

public class filedata 
{
	public static void main(String[] args) throws IOException 
	{
	File f= new File("C:\\Users\\vipin\\Desktop\\New Text Document.txt");
	FileReader fr=new FileReader(f);
	BufferedReader b=new BufferedReader(fr);
	String s;
	while((s=b.readLine())!=null)
	{
		System.out.println(s);
	}
	}

}
