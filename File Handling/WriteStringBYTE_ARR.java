import java.io.*;
import java.util.*;
class WriteByteString{
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
				
				//dt arr[]=new dt[size]
				byte b[]=Str.getBytes();
				
				
				fout.write(b);
				fout.close();
			}
		}
		catch(IOException i){	}
	}
}