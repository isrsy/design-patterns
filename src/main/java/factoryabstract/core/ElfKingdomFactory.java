package factoryabstract.core;

import factoryabstract.KingdomFactory;
import factoryabstract.core.Army;
import factoryabstract.core.Castle;
import factoryabstract.core.ElfArmy;
import factoryabstract.core.ElfCastle;
import factoryabstract.core.ElfKing;
import factoryabstract.core.King;

public class ElfKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}