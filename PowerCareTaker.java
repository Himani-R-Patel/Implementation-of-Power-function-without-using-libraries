
import java.util.ArrayList;
import java.util.List;

public class PowerCareTaker {
  private List<PowerMemento> mementoList = new ArrayList<PowerMemento>();

  public void add(PowerMemento state) {
    mementoList.add(state);
  }

  public PowerMemento get(int index) {
    return mementoList.get(index);
  }
}

