package pipeline2.handle;

import pipeline2.model.PipeLineContext;
import pipeline2.model.Result;
import pipeline2.model.ResultImpl;

/**
 * @author: rensiyu
 * @createTime: 2022/09/21
 */
public class RemoveAlphabetsHandler extends NormalHandler {
    @Override
    public Result invoke(PipeLineContext context) {
        char[] aChar = (char[]) context.get("char");
        if (aChar == null) {
            return ResultImpl.fail("2 失败");
        }
        for (int i = 0; i < aChar.length; i++) {
            if (aChar[i] >= 'A' && aChar[i] <= 'z') {
                aChar[i] = ' ';
            }
        }
        context.put("char", aChar);
        return processContinue(context);
    }
}
