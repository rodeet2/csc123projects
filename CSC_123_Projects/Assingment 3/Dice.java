
import java.util.Random;

public class Dice {
	
  public int number;
  
  public int cast() {
	  
	  Random rand = new Random();

	  return number = rand.nextInt(1,7);
	  
  }

@Override
public String toString() {
	 System.out.print("\r\n");
	return "Dice [The Value is =" + number + " ]";
}
  

}
