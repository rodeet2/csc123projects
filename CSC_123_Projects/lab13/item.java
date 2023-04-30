
public class item {
	

	private Object SKU;
	private Object Name;
	private Object qnt;
	private Object unit_price;
	private Object tax;
	private Object size;
	
	
	public Object getQnt() {
		return qnt;
	}


	public Object getName() {
		return Name;
	}


	public Object getUnit_price() {
		return unit_price;
	}


	public Object getTax() {
		return tax;
	}


	public item(Object object, Object object2, Object object3, Object object4, Object object5, Object object6 ) {
		super();
		SKU = object;
		Name = object2;
		this.qnt = object3;
		this.unit_price = object4;
		this.tax = object5;
		this.size = object6;	
	}


	public Object getSize() {
		return size;
	}



	

}
