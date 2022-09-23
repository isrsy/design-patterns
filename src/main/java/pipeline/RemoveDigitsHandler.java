package pipeline;

/**
 * 删除数字
 */
public class RemoveDigitsHandler implements Handler<String, String> {
    @Override
    public String process(String input) {
        if (input != null) {
            StringBuilder builder = new StringBuilder();
            input.chars()
                 .filter(x -> x < '0' || x > '9')
                 .forEach(x -> builder.append((char) x));
            return builder.toString();

        }
        return null;
    }
}