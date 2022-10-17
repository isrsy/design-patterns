package decorator;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 */
public interface Hero {
    /**
     * 攻击
     */
    void attack();

    /**
     * 获取武力值
     */
    int getAttackPower();

    /**
     * 逃跑
     */
    void fleeBattle();
}
