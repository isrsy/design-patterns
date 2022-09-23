package pipeline2;

import pipeline2.model.PipeLineContext;
import pipeline2.model.Result;

public interface PipeLine {

    /**
     * 添加处理器
     */
    void add(Handler handler);

    /**
     * 开启管道
     * @param context 上下文
     * @return flowResult
     */
    Result start(PipeLineContext context);
}