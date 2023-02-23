
public class computer {
	
	public String name;
	public processor pro;
	public harddisk hard;

	public computer(String n,processor p, harddisk h ) {
		this.name = n;	
		this.pro = p;
		this.hard = h;
	}
	
	public void Startprint(String examplefile) {
		
		printer p = new printer(examplefile);
		
		 p.print();
	
	}
	
	public String checkbattery() {
		return "";
	}
	
	public String TurnOff() {
		return "Shutting Down";
	}
	
	public String TurnOn() {
		return "Turning On";
	}
	
}
