package Strategy.Auto;

import Strategy.FillStrategy.FillStrategy;

public abstract class Auto {

    FillStrategy fillStrategy;

    public void fill() {
        fillStrategy.fill();
    }

    public void gas() {
        System.out.println("Едем вперед");
    }

    public void stop() {
        System.out.println("Тормозим!");
    }

}
