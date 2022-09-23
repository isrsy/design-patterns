package strategy.core;

import lombok.extern.slf4j.Slf4j;
import strategy.DragonSlayingStrategy;

/**
 * 远程攻击策略
 */
@Slf4j
public class ProjectileStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        log.info("使用远程攻击策略屠龙！");
    }
}
