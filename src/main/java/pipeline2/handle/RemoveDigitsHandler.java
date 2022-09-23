package pipeline2.handle;

import pipeline2.Handler;
import pipeline2.model.PipeLineContext;
import pipeline2.model.Result;

/**
 * @author: rensiyu
 * @createTime: 2022/09/21
 */
public class RemoveDigitsHandler extends NormalHandler {

    @Override
    public Result invoke(PipeLineContext context) {
        char[] aChar = (char[]) context.get("char");
        for (int i = 0; i < aChar.length; i++) {
            if (aChar[i] >= '0' && aChar[i] <= '9') {
                aChar[i] = ' ';
            }
        }
        context.put("char", aChar);
        return processContinue(context);
    }
}
