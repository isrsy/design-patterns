package strategy.core;

import lombok.extern.slf4j.Slf4j;
import strategy.DragonSlayingStrategy;

/**
 * 近战策略
 */
@Slf4j
public class MeleeStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
      log.info("使用近战策略屠龙！");  
    }
}
