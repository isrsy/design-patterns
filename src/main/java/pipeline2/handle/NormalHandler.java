package pipeline2.handle;

import pipeline2.Handler;
import pipeline2.model.PipeLineContext;
import pipeline2.model.Result;
import pipeline2.model.ResultImpl;

/**
 * @author: rensiyu
 * @createTime: 2022/09/21
 */
public abstract class NormalHandler implements Handler {
    protected Handler next = null;

    @Override
    public Handler getNext() {
        return this.next;
    }

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public Result invoke(PipeLineContext context) {
        return processContinue(context);
    }

    protected Result processContinue(PipeLineContext context) {
        if (next == null) {
            StringBuilder builder = new StringBuilder();
            char[] aChar = (char[]) context.get("char");
            for (char c : aChar) {
                if (c != ' ') {
                    builder.append(c);
                }
            }
            return ResultImpl.ok(builder.toString());
        }
        return getNext().invoke(context);
    }
}
