
public class InvString {
	
	private String input;
	private String output;
	

	public InvString (String in) {
		input = in;
	}
	
	public void inversecal(){
		
		
		
		for (int i = 0 ; i < input.length(); ++i) {
		    
			output = input.charAt(i) + output;
			
		    }
		
	}

	@Override
	public String toString() {
		 System.out.print("\r\n");
		return "InvString [input=" + input + ", output=" + output + "]";
	}
	

	

}
