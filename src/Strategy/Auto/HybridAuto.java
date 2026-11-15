package Strategy.Auto;

import Strategy.FillStrategy.HybridFillStrategy;

public class HybridAuto extends Auto {

    public HybridAuto() {
        this.fillStrategy = new HybridFillStrategy();
    }
}