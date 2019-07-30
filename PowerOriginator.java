/**
 * Represent the class to creates and stores the existing value.
 * @author Himani Patel
 * @version 1.0
 */
public class PowerOriginator {
  
  private Double state;

    /**
   * Represents setter method to set the value.
   * @param state This is a current value.
   */
  public  void setState(Double state) {
    this.state = state;
  }

    /**
   * Represents getter method to get the value.
   * @return state It returns the previously stored value.
   */
  public Double getState() {
    return state;
  }

    /**
   * Represents the method to store value in PowerMemento object.
   * @return powerMemento object.
   */
  public PowerMemento saveStateToMemento() {
    return new PowerMemento(state);
  }
  
    /**
   * Represents the method to get the value of the PowerMemento object.
   * @param memento It is a PowerMemento object.
   */
  public void getStateFromMemento(PowerMemento memento) {
    state = memento.getState();
  }

}
