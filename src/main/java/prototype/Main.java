package prototype;

/**
 * @author: rensiyu
 * @createTime: 2022/09/27
 */
public class Main {
    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactoryImpl(new ElfMage("cooking"), new ElfWarlord("cleaning"), new ElfBeast("ElfBeast protecting"));
        Beast beast = heroFactory.createBeast();
        Mage mage = heroFactory.createMage();
        Warlord warlord = heroFactory.createWarlord();
        System.out.println(beast.toString());
        System.out.println(mage.toString());
        System.out.println(warlord.toString());
        HeroFactory heroFactory1 = new HeroFactoryImpl(null, null, new OrcBeast("OrcBeast protecting"));
        System.out.println(heroFactory1.createBeast());

    }
}
