import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class run {

	public static void main(String[] args) throws IOException {
		
		ServerSocket server=new ServerSocket(1000);
		System.out.println("Listening!!!");
		Socket client=server.accept();
		System.out.println("Client connected!!");
		InputStream in=client.getInputStream();
		OutputStream out=client.getOutputStream();
		InputStreamReader inreader=new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(inreader);
		
		FileManager fm=new FileManager(System.out);
		
		//fm.listFiles();
		//System.out.println(fm.getPath());
		//fm.printFile(".project");
		while(true) {
		out.write((fm.getPath() + ">").getBytes());
		
		String entry = reader.readLine();
		if(entry.equals("") || entry == null) {
			out.write("No entry!".getBytes());
		}
		
		if(entry.equals("dir")) {
			out.write((fm.listFiles()).getBytes());
		}
		
		else if(entry.length()>4) {
			if(entry.substring(0,3).equals("cd ")) {
				String command = entry.substring(3);
				fm.changeDir(command);
			}
			if(entry.substring(0,4).equals("cat ")) {
				String command = entry.substring(4);
				fm.printFile(command);
				out.write(fm.printFile(command).getBytes());
			}
		}else {out.write("command too short! \n".getBytes());}
		

		}	
		}
}
	
	