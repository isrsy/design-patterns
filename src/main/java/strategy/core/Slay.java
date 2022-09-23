package strategy.core;

import strategy.DragonSlayer;
import strategy.DragonSlayingStrategy;

/**
 * @author: rensiyu
 * @createTime: 2022/09/22
 * @description:
 */
public interface Slay {
    Slay changeStrategy(DragonSlayingStrategy strategy);

    void goToBattle();
}
