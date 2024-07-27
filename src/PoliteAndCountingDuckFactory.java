/**
 * PoliteAndCountingDuckFactory
 */
/**
 * Thanawat Potidet
 * 6510450445
 */
public class PoliteAndCountingDuckFactory extends AbstractDuckFactory{
  @Override
  public Quackable createDuckCall() {
    return new QuackCounter(new Polite(new DuckCall()));
  }
 @Override
 public Quackable createRubberDuck() {
  return new QuackCounter(new Polite(new RubberDuck()));
 }  
  @Override
  public Quackable createMallardDuck() {
    return new QuackCounter(new Polite(new MallardDuck()));
  }
  @Override
  public Quackable createRedheadDuck() {
    return new QuackCounter(new Polite(new RedheadDuck()));
  }
}
