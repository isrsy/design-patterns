package pipeline2;

import pipeline2.model.PipeLineContext;
import pipeline2.model.Result;
import pipeline2.model.ResultImpl;

/**
 * @author: rensiyu
 * @createTime: 2022/09/21
 */
public class PipeLineImpl implements PipeLine {
    private Handler head;
    private Handler next;

    @Override
    public void add(Handler handler) {
        if (head == null) {
            head = handler;
        } else {
            next.setNext(handler);
        }
        next = handler;
    }

    @Override
    public Result start(PipeLineContext context) {
        if (context == null) {
            return ResultImpl.fail("context null");
        }
        if (head == null) {
            return ResultImpl.fail("head null");
        }
        return head.invoke(context);
    }
}
