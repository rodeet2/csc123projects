
public class printer {

	 public String name;
	 public String model;
	 public String toprint;
	
	 public printer(String print) {
		 this.toprint = print;
	 }
	 
	 public void print() {
		 System.out.print(":::" + toprint);
	 }
	 
	 public String ShowError() {
		 return "Error";
	 }
	 public String TurnOff() {
		 return "Exit";
	 }


}
