package composite;

public class Letter extends LetterComposite {

    private final char character;

    public Letter(char c) {
        this.character = c;
    }

    @Override
    public void printThisBefore() {
        System.out.print(character);
    }
}