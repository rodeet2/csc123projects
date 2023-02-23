
public class person {
	
	public String name;
	public String address;
	public String age;
	
	public person(String n, String a, String add) {
		this.name = n;	
		this.age = a;
	    this.address = add;		
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getAge() {
		return age;
	}
	
}

