import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileManager {

	private File currentDir;
	private OutputStream out;
	private File intdir;

	public FileManager(OutputStream out) {
		currentDir = new File(System.getProperty("user.dir"));
		this.out = out;
		intdir = currentDir;

	}

	public void changeDir(String dir){
		if (dir.equalsIgnoreCase("..")) {
		    this.currentDir = this.currentDir.getParentFile();
		} 
		
		if (dir.equals("~")) {
			this.currentDir = this.intdir;
		} 
		
		if (dir.equalsIgnoreCase(".")) {
			this.currentDir = this.currentDir;
		} 
		
		else {
			File d = new File(dir);
			if (!d.exists() || !d.isDirectory()) {
				print("\n\nInvalid directory!\n");
			} else {
				currentDir = d;
			}

		}
	}

	public String getPath() {
		return this.currentDir.getAbsolutePath();
	}

	public String listFiles() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("List of files in ").append(this.getPath()).append("\n");
	    int x = 1;
	    for (File f : this.currentDir.listFiles()) {
	        sb.append(String.format("%d - %s [%s]%n", x++, f.getName(), (f.isDirectory() ? "D" : "F")));
	    }
	    return sb.toString();
	}

	public String printFile(String fName) {
	    File f = new File(currentDir, fName);
	    try {
	        if (!f.exists() || f.isDirectory())
	            return "\n\nFile not found!\n\n";
	        InputStream in = new FileInputStream(f);
	        byte[] readBytes = new byte[in.available()];
	        in.read(readBytes);
	        String contents = String.format("\n\n====================\n\n%s\n====================\n\n", new String(readBytes));
	        in.close();
	        return contents;
	    } catch (IOException e) {
	        return "Unable to make read!";
	    }
	}

	private void print(String s) {
		try {
			out.write(s.getBytes());
		} catch (Exception ignored) {
		}
	}

}