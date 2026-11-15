package Strategy.Auto;

import Strategy.FillStrategy.StandartFillStrategy;

public class Sedan extends Auto {

    public Sedan() {
        this.fillStrategy = new StandartFillStrategy();
    }
}
