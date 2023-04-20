import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class cookies {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("www.google.com", 80);

        OutputStream out = socket.getOutputStream();

        out.write("GET / HTTP/1.1\r\n".getBytes());
        out.write("Host: www.google.com\r\n".getBytes());
        out.write("\r\n".getBytes());

        InputStream in = socket.getInputStream();
        InputStreamReader inreader = new InputStreamReader(in);
        BufferedReader reader = new BufferedReader(inreader);

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Set-Cookie")) {
                System.out.println(line);
            }
        }

        socket.close();
    }
}

