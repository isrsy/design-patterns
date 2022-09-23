package strategy;

import strategy.DragonSlayingStrategy;
import strategy.core.Slay;

/**
 * 屠龙者
 */
public class DragonSlayer implements Slay {
    private DragonSlayingStrategy dragonSlayingStrategy;

    public DragonSlayer(DragonSlayingStrategy dragonSlayingStrategy) {
        this.dragonSlayingStrategy = dragonSlayingStrategy;
    }

    @Override
    public DragonSlayer changeStrategy(DragonSlayingStrategy strategy) {
        this.dragonSlayingStrategy = strategy;
        return this;
    }

    @Override
    public void goToBattle() {
        this.dragonSlayingStrategy.execute();
    }
}
