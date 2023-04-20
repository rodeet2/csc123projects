import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class header_words_char {

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
        int headerC = 0;
        int wordC = 0;
        int charC = 0;

        System.out.println("Calculating....");// it takes a while to print for some reason

        while ((line = reader.readLine()) != null) {
            headerC++;
            
            String[] wordselement = line.trim().split("\\s+");
            wordC += wordselement.length;
            for (String word : wordselement) {
                charC += word.length();
            }
        }
        System.out.println("Total Number of headers: " + headerC);
        System.out.println("Total Number of words: " + wordC);
        System.out.println("Total Number of Characters: " + charC);

        socket.close();
    }
}

