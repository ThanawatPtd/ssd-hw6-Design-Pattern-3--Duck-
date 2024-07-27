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

  public QuackCounter(Quackable duck){
    this.duck = duck;
  }
  @Override
  public void quack(){
    duck.quack();
    numberQuacks++;
  }


  public static int getQuacks(){
    return numberQuacks;
  }

}
