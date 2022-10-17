package composite;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author: rensiyu
 * @createTime: 2022/09/28
 */
public class Main {
    public static void main(String[] args) {
        List<Word> words = Arrays.asList(
                new Word('W', 'h', 'e', 'r', 'e'),
                new Word('t', 'h', 'e', 'r', 'e'),
                new Word('i', 's'),
                new Word('a'),
                new Word('w', 'h', 'i', 'p'), 
                new Word('t', 'h', 'e', 'r', 'e'),
                new Word('i', 's'),
                new Word('a'),
                new Word('w', 'a', 'y')
            );

        Sentence sentence = new Sentence(words);
        sentence.print();
    }
}
