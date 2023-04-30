import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class jsonmaker_2 {
	
	
	String json1 = "[\"Apples\", \"Oranges\", \"Banana\"]";
	String json2 = "{\"Make\":\"Toyota\", \"YearsOld\":3, \"Odometer\":12342, \"Price\":23122.00, \"Color\":\"Black\"}";
	String json3 = "[{\"Make\":\"Toyota\", \"YearsOld\":3, \"Odometer\":22342, \"Price\":13122.00, \"Color\":\"White\"}, {\"Make\":\"Honda\", \"YearsOld\":5, \"Odometer\":13342, \"Price\":24122.00, \"Color\":\"Black\"}]";
	
	
	//json1
	String[] sarray = {"Apples", "Oranges", "Banana"};
	
	//json2
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("Make", "Toyota");
	map.put("YearsOld", "3");
	map.put("Odometer", "12342");
	map.put("Price", "23122.00");
	map.put("Color", "Black");
	
	//json3
	
	
	Map<String, Object> car1 = new HashMap<String, Object>();
	map.put("Make", "Toyota");
	map.put("YearsOld", "3");
	map.put("Odometer", "12342");
	map.put("Price", "23122.00");
	map.put("Color", "White");

	Map<String, Object> car2 = new HashMap<String, Object>();
	map.put("Make", "Honda");
	map.put("YearsOld", "5");
	map.put("Odometer", "13342");
	map.put("Price", "24122.00");
	map.put("Color", "White");

	
	Object[] carlist = {car1, car2};

	//json4
	
	String json4 = "[{\"StudentId\":\"BC110023\",\"Name\":\"Joe Blogs\",\"Email\":\"joe@email.com\",\"Courses\":[\"CSC-123\",\"CSC123-Lab\"]},{\"StudentId\":\"BC110024\",\"Name\":\"Jane Doe\",\"Email\":\"jane@email.com\",\"Courses\":[\"CSC-123\",\"CSC123-Lab\"]}]";

	
	String[] courses1 = {"CSC-123", "CSC-Lab"};
	
	Map<String, Object> Student1 = new HashMap<String, Object>();

	Student1.put("StudentId", "BC110023");
	Student1.put("Name", "Joe Blogs");
	Student1.put("Email", "joe@email.com");
	Student1.put("Courses", courses1);
	
	Map<String, Object> Student2 = new HashMap<String, Object>();
	
	Student2.put("StudentId", "BC110024");
	Student2.put("Name", "Jane Doe");
	Student2.put("Email", "jane@email.com");
	Student2.put("Courses", courses1);
	
	
	Object[] studentlist = {Student1, Student2};



}
