package cloud.chrubasik.dp01_intro_strategypattern.duck;

import cloud.chrubasik.dp01_intro_strategypattern.duck.duckBehavior.flyBehavior.FlyBehavior;
import cloud.chrubasik.dp01_intro_strategypattern.duck.duckBehavior.quackBehavior.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performQuack() {
        flyBehavior.fly();
    }

    public void performFly() {
        quackBehavior.quack();
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }



    public abstract void swim();

    public abstract void display();
}
