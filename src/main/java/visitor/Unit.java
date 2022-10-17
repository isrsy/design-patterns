package visitor;

import java.util.Arrays;

/**
 * @author: rensiyu
 * @createTime: 2022/09/28
 */
public abstract class Unit {
    private Unit[] children;

    public Unit(Unit... children) {
        this.children = children;
    }

    public void accept(UnitVisitor visitor) {
        for (Unit child : children) {
            child.accept(visitor);
        }
//        Arrays.stream(children).forEach(c -> c.accept(visitor));
    }
}
