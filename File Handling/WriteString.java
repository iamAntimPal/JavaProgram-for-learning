import java.io.*;
import java.util.*;
class WriteString{
	public static void main(String ar[])
	{
		Scanner sc =new Scanner(System.in);
		String Str;
		try{	
			FileOutputStream fout=new FileOutputStream("data.txt");
			if(fout==null)
			{
				System.out.println("file not open ");
			}
			else{
				System.out.println("enter string ");
				Str=sc.nextLine(); // hello how are u ?
				
				for(int i=0;i<Str.length();i++)
				{
					fout.write(Str.charAt(i));
				}
				fout.close();
			}
		}
		catch(IOException i){	}
	}
}