
public class traditionalcar extends car {

	public String enginetype;
	public int fuellevel;
	public int transmition;
	
	public traditionalcar(String n, sn Sat) {
		super(n,Sat);
	}
	
	
	public int checkfuel() {
		return fuellevel;
	}
	
	public void changeTransmition(int t) {
		transmition = t;
	}
	
	public void locateGasStations() {
		
	}
	
}
