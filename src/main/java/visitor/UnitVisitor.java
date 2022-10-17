package visitor;

import visitor.people.Commander;
import visitor.people.Sergeant;
import visitor.people.Soldier;

/**
 * @author: rensiyu
 * @createTime: 2022/09/28
 */
public interface UnitVisitor {
    void visit(Soldier soldier);

    void visit(Sergeant sergeant);

    void visit(Commander commander);
}
