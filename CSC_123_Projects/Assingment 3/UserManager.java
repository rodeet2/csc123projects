
import java.util.Arrays;
import java.util.Scanner;


public class UserManager {
	
	public String[] lastnames = new String[3000];;
	public String[] emails= new String[3000];
	public int input;
	public int counter = 0;
	public String list = "";
	
	public void start(){
		Scanner sc = new Scanner(System.in);
	 System.out.print("\r\n");
	 System.out.println("1 – Register User");
	 System.out.println("2 – List Users");
	 System.out.println("3 – Exit");
	 
	 System.out.println("Please enter your choice: ");
	 
	 input = sc.nextInt();
	 
	 if (input == 1) { ru();}
	 else if (input == 2) { lu();}
	 else if (input == 3) { e();}
	 else {System.out.println("Invalid input!" + "\r\n"); start();}
	}
	
	public void ru() {
		//Enter last name: Doe
		//Enter email address: jane.doe@csudh.edu
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter last name: ");
		 String lastname = sc.next();
		 System.out.println("Enter email address: ");
		 String email = sc.next();
		 
		 lastnames[counter +1] = lastname;
		 emails[counter +1] = email;
		 
		 counter++;
		 System.out.print("\r\n");
		 System.out.println(" Thank you, user " + lastname + " " + email + " has been registered" );		 
	
		 start();
	}
	
    public void lu() {
    	
      for (int i = 1; i <= counter; i++) {
    	 
    	list = list + (" "+ i + " - "+ lastnames[i] + ", " + emails[i]);
      }
      
      System.out.print("\r\n");
      System.out.println(list);
      System.out.print("\r\n");
      System.out.println("Total Entries: " + counter );
		
      start();
      
	}
    public void e() {
    	
    	 System.out.print("\r\n");
    	System.out.println("Thank you for using User Manager, Goodbye");
	   System.exit(0);
	
    }   

}
