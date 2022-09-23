package pipeline;

/**
 * 转换char
 */
public class ConvertToCharArrayHandler implements Handler<String, char[]> {
    @Override
    public char[] process(String input) {
        if (input != null) {
            return input.toCharArray();
        }
        return new char[0];
    }
}