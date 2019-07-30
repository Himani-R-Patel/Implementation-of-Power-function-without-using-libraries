/**
 * Represent the class to contain value of an object to be restored.
 * @author Himani Patel
 * @version 1.0
 */
public class PowerMemento {
  
  private Double state;

  public PowerMemento(Double state) {
    this.state = state;
  }

   /**
   * Represents the method to get the previously  stored value.
   * @return state It returns previously stored value.
   */
  
  public Double getState() {
    return state;
  }

}
