package pipeline;

/**
 * 删除字母
 */
public class RemoveAlphabetsHandler implements Handler<String, String> {
    @Override
    public String process(String input) {
        if (input != null) {
            StringBuilder builder = new StringBuilder();
            input.chars()
                 .filter(x -> x < 'A' || x > 'z')
                 .forEach(x -> builder.append((char) x));
            return builder.toString();

        }
        return null;
    }
}