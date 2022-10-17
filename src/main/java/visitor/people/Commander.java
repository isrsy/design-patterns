package visitor.people;

import visitor.Unit;
import visitor.UnitVisitor;

/**
 * @author: rensiyu
 * @createTime: 2022/09/28
 */
public class Commander extends Unit {
    public Commander(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visit(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "commander";
    }
}
