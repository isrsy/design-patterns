package prototype;


public class OrcBeast extends Beast {

    private final String weapon;

    public OrcBeast(String weapon) {
        this.weapon = weapon;
    }

    public OrcBeast(OrcBeast orcBeast) {
        super(orcBeast);
        this.weapon = orcBeast.weapon;
    }

    @Override
    public String toString() {
        return "Orcish wolf attacks with " + weapon;
    }

}