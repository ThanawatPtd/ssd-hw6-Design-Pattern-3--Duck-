/**
 * PigeonAdaptor
 */
/**
 * Thanawat Potidet
 * 6510450445
 */
public class PigeonAdaptor implements Quackable {
  Pigeon pigeon;

  public PigeonAdaptor(Pigeon pigeon) {
    this.pigeon = pigeon;
  }

  @Override
  public void quack() {
    pigeon.coo();
    pigeon.coo();
  }
  
  @Override
  public boolean isPolite() {
    return false;
  }
}
