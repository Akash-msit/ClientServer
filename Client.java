import java.io.*;
import java.net.*; 
public class Client {
	public static void main(String[] args)throws Exception {  
		Socket s=new Socket("localhost",7777);
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1="",str2="";
		while(!str1.equals("bye"))
		{
			str1=br.readLine();
			dout.writeUTF(str1);
			dout.flush();
			System.out.println("Server says:"+str2);
		} 
		dout.close();
		s.close();

}
}
