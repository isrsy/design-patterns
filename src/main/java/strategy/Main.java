package strategy;

import lombok.extern.slf4j.Slf4j;
import strategy.Lambda.LambdaStrategy;
import strategy.core.MeleeStrategy;
import strategy.core.ProjectileStrategy;
import strategy.core.SpellStrategy;

/**
 * @author: rensiyu
 * @createTime: 2022/09/22
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        DragonSlayer dragonSlayer = new DragonSlayer(() -> log.info("自定义攻击"));
        dragonSlayer.goToBattle();
        dragonSlayer.changeStrategy(new MeleeStrategy()).goToBattle();
        dragonSlayer.changeStrategy(new ProjectileStrategy()).goToBattle();
        dragonSlayer.changeStrategy(new SpellStrategy()).goToBattle();


        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.MeleeStrategy).goToBattle();
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.ProjectileStrategy).goToBattle();
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.SpellStrategy).goToBattle();
    }
}
