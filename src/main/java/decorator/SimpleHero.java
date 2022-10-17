package decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 */
@Slf4j
public class SimpleHero implements Hero {
    @Override
    public void attack() {
        log.info("发动一般攻击");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        log.info("打不过，逃跑");
    }
    
    
}
