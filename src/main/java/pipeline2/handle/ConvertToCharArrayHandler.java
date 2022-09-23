package pipeline2.handle;

import pipeline2.model.PipeLineContext;
import pipeline2.model.Result;
import pipeline2.model.ResultImpl;

/**
 * @author: rensiyu
 * @createTime: 2022/09/21
 */
public class ConvertToCharArrayHandler extends NormalHandler {
    @Override
    public Result invoke(PipeLineContext context) {
        String o = (String) context.get("str");
        if (o == null) {
            return ResultImpl.fail("1 失败");
        }
        context.put("char", o.toCharArray());
        return processContinue(context);
    }
}
