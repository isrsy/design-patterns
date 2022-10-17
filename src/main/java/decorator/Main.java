package decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        LegendHero legendHero = new LegendHero(new SimpleHero());
        legendHero.attack();
        log.info("武力值：{}", legendHero.getAttackPower());
        legendHero.fleeBattle();
    }
}
