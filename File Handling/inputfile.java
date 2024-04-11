import java.io.*;
class WriteData{
	public static void main(String ar[])
	{
		int ch;
		try{
						
			FileInputStream fout = new FileInputStream("C:\\Users\\HP\\Desktop\\check\\Test.txt");
			ch=fout.read();
			fout.close();
			System.out.println("answer"+(char)ch);
			System.out.printf("answer %c",ch);
		}
		catch(Exception e){ System.err.println("error is ");}
		
		
	}
}