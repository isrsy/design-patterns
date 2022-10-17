package composite;

import java.util.List;

public class Word extends LetterComposite {

    public Word(List<Letter> letters) {
        letters.forEach(this::add);
    }

    public Word(char... letters) {
        for (char letter : letters) {
            this.add(new Letter(letter));
        }
    }

    @Override
    public void printThisBefore() {
        System.out.print(" ");
    }
}