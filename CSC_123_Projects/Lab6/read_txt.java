import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class read_txt {

	public static void main(String[] args) throws IOException, TooManyNumbersException {
		
	
		File file = new File(
	            "C:\\Users\\srozbu1\\Desktop\\darwin.txt");
		
		BufferedReader br
        = new BufferedReader(new FileReader(file));
		
		int text = 0;
        int count = 0;
		
	
		while ((text = br.read()) != -1) {
			 char c = (char) text;
			 
			 if(c==1 || c==2 || c==3 || c==4 || c==5 || c==6 || c==7 || c==8 || c==9 || c==10) {
				count++;
			 }
			 
			if(count>10) { throw new TooManyNumbersException("There was over 10 numbers in the text!");}
			 
	}
		

	}

}
