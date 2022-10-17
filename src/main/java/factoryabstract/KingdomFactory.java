package factoryabstract;

import factoryabstract.core.Army;
import factoryabstract.core.Castle;
import factoryabstract.core.King;

public interface KingdomFactory {
    Castle createCastle();

    King createKing();

    Army createArmy();
}