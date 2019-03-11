package starpattern;

import java.io.*;

public class filewrite 
{
public static void main(String[] args) throws IOException
{
	File f= new File("C:\\Users\\vipin\\Desktop\\New Text Document.txt");
	File f1= new File("C:\\Users\\vipin\\Desktop\\N.txt");

	FileReader fr=new FileReader(f);
	FileWriter fw=new FileWriter(f1);
	BufferedReader br= new BufferedReader(fr);
	BufferedWriter bw= new BufferedWriter(fw);
	
	String s;
	while((s=br.readLine())!=null)
	{
		bw.write(s);
		bw.newLine();
	}
	bw.close();
}
}
