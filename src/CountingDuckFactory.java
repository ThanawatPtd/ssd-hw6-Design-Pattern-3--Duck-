/**
 * CountingDuckFactory
 */
/**
 * Thanawat Potidet
 * 6510450445
 */
public class CountingDuckFactory extends AbstractDuckFactory{
  @Override
  public Quackable createRubberDuck() {
    return new QuackCounter(new RubberDuck());
  }
  @Override
  public Quackable createDuckCall() {
    return new QuackCounter(new DuckCall());
  }

  @Override
  public Quackable createRedheadDuck() {
    return new QuackCounter(new RedheadDuck());
  }

  @Override
  public Quackable createMallardDuck() {
    return new QuackCounter(new MallardDuck());
  }
}
