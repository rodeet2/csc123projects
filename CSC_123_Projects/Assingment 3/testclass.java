
public class testclass {

	public static void main(String[] args) {
		
		//Inverse String
		
		InvString is = new InvString("This is life");
		is.inversecal();
		System.out.println(is);
		
		
		//Circle
		
		Cicrle c = new Cicrle("My Circle", 20);
		System.out.println(c);
		
		// Dice
		
		Dice d = new Dice();
		d.cast();
		System.out.println(d);
		
		//User Manager
		
		UserManager um = new UserManager();
		um.start();
		
	}
	
	
	
	

}
