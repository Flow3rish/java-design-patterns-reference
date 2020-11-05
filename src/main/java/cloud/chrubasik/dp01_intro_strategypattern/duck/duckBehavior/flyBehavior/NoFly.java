package cloud.chrubasik.dp01_intro_strategypattern.duck.duckBehavior.flyBehavior;


public class NoFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("doesn't fly!");
    }
    
}
