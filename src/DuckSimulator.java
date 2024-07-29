/**
 * DuckSimulator
 */
/**
 * Thanawat Potidet
 * 6510450445
 */
public class DuckSimulator {
  public static void main(String[] args) {
    DuckSimulator duckSimulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new DuckFactory();
    AbstractDuckFactory duckCountFactory = new CountingDuckFactory();
    AbstractDuckFactory duckCountPoliteFactory = new PoliteAndCountingDuckFactory();
//    duckSimulator.simulate(duckCountPoliteFactory);
    duckSimulator.simualte();
  }
  
  void simualte(){
    Quackable mallardDuck = new QuackCounter(new Polite(new MallardDuck()));
    Quackable redheadDuck = new QuackCounter(new Polite(new RedheadDuck()));
    Quackable duckCall = new QuackCounter(new Polite(new DuckCall()));
    Quackable rubberDuck = new QuackCounter(new Polite(new RubberDuck()));

    Quackable duckCall2 = new Polite(new QuackCounter(new DuckCall()));
    
    simulater(mallardDuck);
    simulater(redheadDuck);
    simulater(duckCall2);
    simulater(duckCall);
    simulater(rubberDuck);

    System.out.println("The duck quacked " + QuackCounter.getQuacks() + " times");
    System.out.println("The duck polite quacked " + QuackCounter.getPoliteQuacks() + " times");

  }


  void simulate(AbstractDuckFactory duckFactory) {
    Quackable mallardDuck = duckFactory.createMallardDuck();
    Quackable redheadDuck = duckFactory.createRedheadDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable rubberDuck = duckFactory.createRubberDuck();

    Flock flockOfDuck = new Flock();
    flockOfDuck.add(mallardDuck);
    flockOfDuck.add(redheadDuck);
    flockOfDuck.add(duckCall);
    flockOfDuck.add(rubberDuck);

    Quackable gooseDuck = new QuackAdaptor(new Goose());
    Quackable pigeon = new PigeonAdaptor(new Pigeon());

  //  simulate(mallardDuck);
  //  simulate(redheadDuck);
  //  simulate(duckCall);
  //  simulate(rubberDuck);
  //  simulate(gooseDuck);
  //  simulate(pigeon);
    
    simulate(flockOfDuck);

    System.out.println("The duck quacked " + QuackCounter.getQuacks() + " times");
  }

  void simulate(Quackable duck) {
    duck.quack();
  }
  public void simulater(Quackable duck) {
    duck.quack();
  }
}
