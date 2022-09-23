package pipeline;

/**
 * 收集和执行处理程序的管道
 */
public class Pipeline<I, O> {
    private final Handler<I, O> handler;


    public Pipeline(Handler<I, O> handler) {this.handler = handler;}

    <K> Pipeline<I, K> addHandler(Handler<O, K> newHandler) {
        return new Pipeline<>(input -> newHandler.process(handler.process(input)));
    }

    O execute(I input) {
        return handler.process(input);
    }
}
