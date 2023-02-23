
public class Cicrle {

	private String name;
	private int r;
	private double a;
	private double c;
	
	
	public Cicrle(String name, int r) {
		super();
		this.name = name;
		this.r = r;
		//a= pie * r *r
		//c= 2 * pie * r
		
		a = 3.14 * r * r;
		c = 2 * 3.14 * r;
		
	}
	

	@Override
	public String toString() {
		 System.out.print("\r\n");
		return "Cicrle [name=" + name + ", Radius=" + r + ", Area=" + a + ", Circumference=" + c + "]";
	}
	

	

	
}
