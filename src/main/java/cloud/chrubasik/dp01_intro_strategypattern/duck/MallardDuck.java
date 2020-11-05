package cloud.chrubasik.dp01_intro_strategypattern.duck;

import cloud.chrubasik.dp01_intro_strategypattern.duck.duckBehavior.flyBehavior.FlyWithWings;
import cloud.chrubasik.dp01_intro_strategypattern.duck.duckBehavior.quackBehavior.NormalQuack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        // TODO -> next time we won't program to an implementation
        this.quackBehavior = new NormalQuack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void swim() {
        System.out.println("Mallard duck swims.");
    }

    @Override
    public void display() {
        System.out.println("Here's a mallard duck.");
    }
}
