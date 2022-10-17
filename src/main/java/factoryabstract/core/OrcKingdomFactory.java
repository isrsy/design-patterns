package factoryabstract.core;

import factoryabstract.KingdomFactory;

public class OrcKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        //    return new OrcCastle();
        return null;
    }

    @Override
    public King createKing() {
        //    return new OrcKing();
        return null;
    }

    @Override
    public Army createArmy() {
        //        return new OrcArmy();
        return null;
    }
}