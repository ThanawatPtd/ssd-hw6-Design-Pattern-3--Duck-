/**
 * QuackCounter
 */
/**
 * Thanawat Potidet
 * 6510450445
 */
public class QuackCounter implements Quackable{
  Quackable duck;
  static int numberQuacks;
  static int politeNumberQuacks;

  public QuackCounter(Quackable duck){
    this.duck = duck;
  }
  @Override
  public void quack(){
    duck.quack();
    numberQuacks++;
    if(duck.isPolite()){
      politeNumberQuacks++;
    }
  }
  @Override
  public boolean isPolite() {
    return false;
  }

  public static int getQuacks(){
    return numberQuacks;
  }
  
  public static int getPoliteQuacks(){
    return politeNumberQuacks;
  }
}
