import java.io.*;
class WriteData{
	public static void main(String ar[])
	{
		try{
			FileOutputStream fout = new FileOutputStream("C:\\Users\\HP\\Desktop\\check\\Test.txt");
			fout.write('a');
			fout.close();
		}
		catch(Exception e){}
		
		
	}
}