package cloud.chrubasik.dp01_intro_strategypattern.duck;

import cloud.chrubasik.dp01_intro_strategypattern.duck.duckBehavior.flyBehavior.NoFly;
import cloud.chrubasik.dp01_intro_strategypattern.duck.duckBehavior.quackBehavior.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        // TODO -> next time we won't program to an implementation
        this.flyBehavior = new NoFly();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void swim() {
        System.out.println("Rubber duck floats.");

    }

    @Override
    public void display() {
        System.out.println("Here's a rubber duck.");

    }
    
}
