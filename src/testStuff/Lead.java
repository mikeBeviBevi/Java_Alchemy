

package testStuff;

/**
 *
 * @author Concept Analysis Branch 
 */
public class Lead {
public int number;
public String shucks;

  public Lead(Object saveableItem) {
    this.number =((SaveableLead)saveableItem).number;
    this.shucks =((SaveableLead)saveableItem).shucks;
  }

  public Lead() {
  this.number =2;
  this.shucks ="shucksItem";                
  
  }

  

}
