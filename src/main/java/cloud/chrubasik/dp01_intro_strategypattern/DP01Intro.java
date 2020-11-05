package cloud.chrubasik.dp01_intro_strategypattern;

import java.util.ArrayList;
import java.util.List;

import cloud.chrubasik.dp01_intro_strategypattern.duck.Duck;
import cloud.chrubasik.dp01_intro_strategypattern.duck.MallardDuck;
import cloud.chrubasik.dp01_intro_strategypattern.duck.RubberDuck;

public class DP01Intro {
    public static void main(String[] args) {
        Duck squeaky = new RubberDuck();
        Duck ducky = new MallardDuck();

        List<Duck> duckList = new ArrayList<>();
        duckList.add(squeaky);
        duckList.add(ducky);

        for (Duck duck : duckList) {
            duck.display();
            duck.swim();
            duck.performFly();
            duck.performQuack();
            System.out.println();
        }

    }
}
