import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class listen {

	public static void main(String[] args) throws IOException{
			
		ServerSocket server=new ServerSocket(1000);
	
		System.out.println("Listening!!!");
		Socket client=server.accept();
		
		System.out.println("Client connected!!");
		
		InputStream in=client.getInputStream();
		OutputStream out=client.getOutputStream();
		InputStreamReader inreader=new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(inreader);

		out.write("What is your name?\n".getBytes());
		
		String name = reader.readLine();
		
		System.out.println("It is very nice to meet you " + name);
		
		
	}

}