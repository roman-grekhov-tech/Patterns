package Strategy.Auto;

import Strategy.FillStrategy.F1PitstopStrategy;

public class F1Car extends Auto {

    public F1Car() {
        this.fillStrategy = new F1PitstopStrategy();
    }
}
