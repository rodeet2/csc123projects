
public class maintest {

	public static void main(String[] args) {
		
		sn adanceSatalite3 = new sn();
        electriccar teslamodel3 = new electriccar("Tesla Model 3",adanceSatalite3, true );
		
		harddisk deltaware = new harddisk("Deltaware", "2023", "67");
		processor inteli913900k = new processor("Intel i-913900k", "2023", "new");
		computer dellinspire = new computer("Dell Inspire",inteli913900k,deltaware);
		
		dellinspire.Startprint("Hello World");
		
		
	}

}
