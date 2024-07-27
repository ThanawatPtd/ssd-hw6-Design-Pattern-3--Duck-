/**
 * DuckSimulator
 */
public class DuckSimulator {
  public static void main(String[] args) {
    DuckSimulator duckSimulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new DuckFactory();
    AbstractDuckFactory duckCountFactory = new CountingDuckFactory();
    AbstractDuckFactory duckCountPoliteFactory = new PoliteAndCountingDuckFactory();
    duckSimulator.simulate(duckCountPoliteFactory);
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
}
