import java.io.*;
class ReadString{
	public static void main(String ar[]) throws IOException 
	{
			FileInputStream fin=new FileInputStream("data.txt");
			if(fin==null)
			{
				System.out.println("file not open ");
			}
			else{
				int ch=0;
				while(true)
				{
					if(ch==-1)
						break;
					ch=fin.read();
					System.out.print((char)ch);
				}
			}
	}
}


/*
single char read from file
				int ch;
				ch=fin.read();
				System.out.println((char)ch);


*/


