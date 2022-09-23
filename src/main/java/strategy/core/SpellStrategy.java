package strategy.core;

import lombok.extern.slf4j.Slf4j;
import strategy.DragonSlayingStrategy;

/**
 * 法术攻击
 */
@Slf4j
public class SpellStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        log.info("使用法术攻击策略！");
    }
}
