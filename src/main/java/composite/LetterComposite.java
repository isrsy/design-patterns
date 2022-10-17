package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: rensiyu
 * @createTime: 2022/09/28
 */
public abstract class LetterComposite {
    private final List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite letter) {
        children.add(letter);
    }

    public int size() {
        return children.size();
    }

    public void print() {
        printThisBefore();
        children.forEach(LetterComposite::print);
        printThisAfter();
    }

    public void printThisAfter() {

    }

    public void printThisBefore() {
        // TODO document why this method is empty
    }
}
