import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class student_maps_list {

	public static void main(String[] args) {
		
		HashMap Students = new HashMap();
		

        Set<String> hobbies1 = new TreeSet<String>(); 
        hobbies1.add("swim");
        Set<String> hobbies2 = new TreeSet<String>(); 
        hobbies2.add("video games");
        Set<String> hobbies3 = new TreeSet<String>(); 
        hobbies3.add("computer science");
		
        
	    HashMap id1 = new HashMap();
	    id1.put("Name", "John");
	    id1.put("Email", "E");
	    id1.put("Hobbies",hobbies1 );

		HashMap id2 = new HashMap();
		
	    id2.put("Name", "Kat");
	    id2.put("Email", "E");
	    id2.put("Hobbies",hobbies2 );
	    
		HashMap id3 = new HashMap();
		
	    id3.put("Name", "Jacky");
	    id3.put("Email", "E");
	    id3.put("Hobbies",hobbies3 );
		
	    
	  
		
		Students.put("001", id1);
		Students.put("002", id2);
		Students.put("003", id3);
		
		System.out.print(Students);

	
		
		

	}

}
