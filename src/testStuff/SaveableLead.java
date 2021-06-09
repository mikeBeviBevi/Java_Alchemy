

package testStuff;

/**
 *
 * @author Concept Analysis Branch 
 */
public class SaveableLead {
public int number;
public String shucks;

  public SaveableLead(Object item) {
  this.number =((Lead)item).number;
  this.shucks =((Lead)item).shucks;
  }

  public SaveableLead() {
  this.number =1;
  this.shucks ="shucksSaveable";                
  }

  
  
}
