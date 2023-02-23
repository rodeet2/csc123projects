
public class electriccar extends car {

	public String BatteryType;
	public int fronttrunkspace;
	public Boolean autopilot;
	
	public electriccar(String n, sn Sat, Boolean ap) {
		super(n,Sat);
		this.autopilot = ap;
	}
	
	
	public String showBatteryStatus() {
		return "";
	}
	
	public Boolean StartAutopilot() {
		return true;
	}
	public Boolean StopAutopilot() {
		return false;
	}
}

