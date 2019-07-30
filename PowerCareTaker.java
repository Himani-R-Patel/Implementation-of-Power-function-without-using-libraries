
import java.util.ArrayList;
import java.util.List;

/**
 * Represent the class to restore object value from PowerMemento class.
 * @author Himani Patel
 * @version 1.0
 */


public class PowerCareTaker {
  private List<PowerMemento> mementoList = new ArrayList<PowerMemento>();

  
  /**
   * Represent the method to add the value in the list.
   * @param state This is the value of result.
   */
  
  public void add(PowerMemento state) {
    mementoList.add(state);
  }
  
   /**
   * Represents the class to get the value at particular index.
   * @param index This is index.
   * @return PowerMemento object at a particular index.
   */


  public PowerMemento get(int index) {
    return mementoList.get(index);
  }
}

