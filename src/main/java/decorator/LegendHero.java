package decorator;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 */
public class LegendHero implements Hero {
    private final Hero decorated;

    public LegendHero(Hero decorated) {
        this.decorated = decorated;
    }

    @Override
    public void attack() {
        decorated.attack();
    }

    @Override
    public int getAttackPower() {
        return decorated.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        decorated.fleeBattle();
    }
}
