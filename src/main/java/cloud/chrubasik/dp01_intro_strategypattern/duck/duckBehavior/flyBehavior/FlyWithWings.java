package cloud.chrubasik.dp01_intro_strategypattern.duck.duckBehavior.flyBehavior;


public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("flies by flapping its wings!");
    }
    
}
