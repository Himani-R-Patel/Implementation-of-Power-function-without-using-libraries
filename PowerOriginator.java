
public class PowerOriginator {
  
  private Double state;

  public  void setState(Double state) {
    this.state = state;
  }

  public Double getState() {
    return state;
  }

  public PowerMemento saveStateToMemento() {
    return new PowerMemento(state);
  }

  public void getStateFromMemento(PowerMemento memento) {
    state = memento.getState();
  }

}
