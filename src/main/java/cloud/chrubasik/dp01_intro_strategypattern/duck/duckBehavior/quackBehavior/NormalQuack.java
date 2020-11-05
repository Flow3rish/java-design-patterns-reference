package cloud.chrubasik.dp01_intro_strategypattern.duck.duckBehavior.quackBehavior;


public class NormalQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
    
}
