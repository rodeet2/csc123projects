import java.util.InputMismatchException;
import java.util.Scanner;

public class aandbdivide {

	public static void main(String[] args) {
	
	int a = 0;
    float b = 0;
	float divide = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter int a: ");	
	
	try {
		a = scanner.nextInt();
	} catch (InputMismatchException e) {
		System.out.print("Invalid input, please enter a as integer");
		return;
	}
	System.out.print("Enter float b: ");
	
	try {
		b = scanner.nextFloat();
	} catch (InputMismatchException e) {
		System.out.print("Invalid input, please enter b as float");
		return;
	}

	if(a == (int)a && b == (float)b) {
	
		       divide = a/b; 
		       
		       if(Float.isInfinite(divide)) {System.out.print("Diving anything by zero will result in infinity");
		       return;}
		       if(Float.isNaN(divide)) {System.out.print("Zero divided by zero is 0");
		       return;}
		       
		       System.out.print("The result: " + divide);
               
	}
		       
	}


}
