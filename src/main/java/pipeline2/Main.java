package pipeline2;

import com.alibaba.fastjson.JSON;

import pipeline2.handle.ConvertToCharArrayHandler;
import pipeline2.handle.NormalHandler;
import pipeline2.handle.RemoveAlphabetsHandler;
import pipeline2.handle.RemoveDigitsHandler;
import pipeline2.model.PipeLineContext;
import pipeline2.model.Result;

/**
 * @author: rensiyu
 * @createTime: 2022/09/21
 */
public class Main {
    public static void main(String[] args) {
        PipeLineContext context = new PipeLineContext(0);
        context.put("str", "aaa123!!!");
        PipeLine pipeLine = new PipeLineImpl();
        pipeLine.add(new ConvertToCharArrayHandler());
        pipeLine.add(new RemoveAlphabetsHandler());
        pipeLine.add(new RemoveDigitsHandler());
        Result start = pipeLine.start(context);
        System.out.println(JSON.toJSONString(start));
    }
}
