
public class division {

	public static void main(String[] args) {
	
		for(int x=0;x<9;x++){
			
			try {
				System.out.println(x / (x % 2));
			} catch (ArithmeticException e) {
				
		System.out.print("Division by zero error");
		
			}
			
			
			}
		
	}

}
