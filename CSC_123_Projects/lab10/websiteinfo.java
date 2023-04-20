import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class websiteinfo {

	public static void main(String[] args) throws Exception {

        Socket socket = new Socket("www.usman.cloud", 80);

        OutputStream out = socket.getOutputStream();

        out.write("GET / HTTP/1.1\r\n".getBytes());
        out.write("Host: www.usman.cloud\r\n".getBytes());
        out.write("\r\n".getBytes());

        InputStream in = socket.getInputStream();
        InputStreamReader inreader = new InputStreamReader(in);
        BufferedReader reader = new BufferedReader(inreader);
        
        String line;
        
        String statuscode = "";
        String cookies = "";
        Boolean cookiesfound = false;
        String contenttype = "";
        String body = "";
        int percentage = 0;
        
        while ((line = reader.readLine()) != null) {
            
        	System.out.println("Calculating..."+percentage);
        	percentage++;
        	
        	 if (line.startsWith("HTTP/1.1")) {
        		  statuscode = line.replace("HTTP/1.1", "");
             }
        	 if (line.startsWith("Content-Type")) {
        		 contenttype = line.replace("Content-Type:", "");
             }
        	 if (line.startsWith("Set-Cookie")) {
        		 cookiesfound = true;
        		 cookies = cookies + line;
             }
        	 
        	 if (line.trim().isEmpty()) {
            body = body + line;
        }

        	 
        }
        
        
        System.out.println("Status Code: " +statuscode +"\n");
        
        if(cookiesfound == true) {
        System.out.println("Cookies: \n" +cookies + "\n");
        }else {
        	System.out.println("No cookies" + "\n");
        }
        System.out.println("Content type: " + contenttype);
        System.out.println("Body: \n" + body );

	}
}
