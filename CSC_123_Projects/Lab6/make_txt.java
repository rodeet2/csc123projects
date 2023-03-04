import java.io.File;
import java.io.IOException;

public class make_txt {

	public static void main(String[] args) throws IOException {
		
		File directory = new File("lab6b/challenge1/subfolder");
		directory.mkdirs();
		
		File file = new File("lab6b/challenge1/subfolder/test.txt");
  
		file.createNewFile();

		file.setReadable(true);

		file.setWritable(false);
		
		file.setExecutable(false);

	}

	
	
}
