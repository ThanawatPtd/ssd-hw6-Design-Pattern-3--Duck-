import java.util.ArrayList;
import java.util.Iterator;

/**
 * Flock
 */
public class Flock implements Quackable {
  ArrayList<Quackable> quackers = new ArrayList<Quackable>();

  public void add(Quackable quackable) {
    quackers.add(quackable);
  }

  @Override
  public void quack() {
    for (int i = 0; i < quackers.size(); i++) {
      if (i == 0) {
        quackers.get(i).quack();
        quackers.get(i).quack();
        quackers.get(i).quack();
      }
      quackers.get(i).quack();
    }
  }

}
