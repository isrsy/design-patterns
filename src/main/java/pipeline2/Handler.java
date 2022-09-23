package pipeline2;

import pipeline2.model.PipeLineContext;
import pipeline2.model.Result;

/**
 * @author: rensiyu
 * @createTime: 2022/09/21
 * @description:
 */
public interface Handler {
    Handler getNext();

    void setNext(Handler handler);

    Result invoke(PipeLineContext context);
}
