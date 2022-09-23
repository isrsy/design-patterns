package pipeline;

/**
 * 处理字符串的流水线
 */
public class Main {
    public static void main(String[] args) {
        // 1、第一个顺序
        Pipeline<String, char[]> pipeline = new Pipeline<>(new RemoveAlphabetsHandler())
                .addHandler(new RemoveDigitsHandler())
                .addHandler(new ConvertToCharArrayHandler());
        char[] execute = pipeline.execute("GoYankees123!");
        System.out.println(execute);
    }
}
