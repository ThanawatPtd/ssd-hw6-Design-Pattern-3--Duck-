/**
 * Polite
 */
/**
 * Thanawat Potidet
 * 6510450445
 */
public class Polite implements Quackable{
  Quackable duck;

  public Polite(Quackable duck){
    this.duck = duck;
  }
  
  @Override
  public void quack() {
    duck.quack();
    System.out.println("Kub");
  }
  
  @Override
  public boolean isPolite() {
    return true;
  }

}
