import java.io.*;  
import java.net.*;  
public class Server{  
	public static void main(String[] args)throws Exception {  
		ServerSocket ss=new ServerSocket(7777);
		Socket s=ss.accept();
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1="",str2="";
		while(!str1.equals("bye"))
		{
			str1=din.readUTF();
			System.out.println("client says:"+str1);
			str2=br.readLine();
			dout.writeUTF(str1);
			dout.flush();
		} 
		dout.close();
		s.close();
		ss.close();

}
}