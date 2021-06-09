package testStuff;

import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author The alchemist
 */
public class SystemsEngineering {

  public static HashMap<String, Object> listOItems = new HashMap<>();
  public static HashMap<String, Object> listOSavebles = new HashMap<>();

  public static void main(String[] args) {
  transmutationCircle();
	
  }

  
  public static void transmutationCircle(){
     for (int i = 0; i < 10; i++) {
      listOItems.put(Lead.class.getCanonicalName(), new Lead());
    }

    for (Entry<String, Object> entry : listOItems.entrySet()) {

      try {
        String alchemy = entry.getValue().getClass().getCanonicalName();
        alchemy = alchemy.replace("FliteViz4D.", "FliteViz4D.saveable.");
        alchemy = alchemy.replace(entry.getValue().getClass().getSimpleName(), "Saveable" + entry.getValue().getClass().getSimpleName());

        //this shit is some crazy a$$ alchemy!
        listOSavebles.put("Saveable" + entry.getValue().getClass().getSimpleName(),
                Class.forName(alchemy).getConstructor(Object.class).newInstance(entry.getValue()));
      } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
        System.out.println("your fucky");
        ex.printStackTrace();
      }
    }
    for (Entry<String, Object> entry : listOSavebles.entrySet()) {
      System.out.println("Name: " + entry.getKey() + "\n Class: " + entry.getValue().getClass().getSimpleName());
    }
  }
	
	
	public void MathCombinationFormula(){
		
	 int eighty = 80;
	 int sum=0;
	 for (int i=4;i<80;i += 4){
		 sum += eighty*(eighty-i);
	 }
	 BigInteger numerator =java.math.BigInteger.valueOf(20);
	 BigInteger count =java.math.BigInteger.valueOf(19);
	 while(!(count.equals(BigInteger.ZERO))){
		 numerator = numerator.multiply(count);
		 count=count.add(BigInteger.ONE.negate());
	 }
	 BigInteger answer =numerator.divide(BigInteger.valueOf((long)sum));
	 System.out.println(answer);
	}
}
