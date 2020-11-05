package cloud.chrubasik.dp01_intro_strategypattern.duck.duckBehavior.quackBehavior;


public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
    
}
