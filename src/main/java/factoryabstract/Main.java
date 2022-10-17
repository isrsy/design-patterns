package factoryabstract;

import factoryabstract.core.Castle;
import factoryabstract.core.ElfKingdomFactory;

/**
 * @author: rensiyu
 * @createTime: 2022/09/27
 */
public class Main {
    public static void main(String[] args) {
        KingdomFactory elfKingdomFactory = new ElfKingdomFactory();
        System.out.println(elfKingdomFactory.createArmy().getDescription());

        Castle castle = FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF).createCastle();
        System.out.println(castle.getDescription());
    }
}
