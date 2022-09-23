package templatemethod;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: rensiyu
 * @createTime: 2022/09/22
 */
@Slf4j
public class CharDisplay extends AbstractDisplay {
    private char[] chars;

    @Override
    public void open() {
        chars = "rty".toCharArray();
        log.info("open----" + chars);
    }

    @Override
    public void print() {
        if (chars != null) {
            log.info(String.valueOf(chars));
        }
    }

    @Override
    public void close() {
        chars = null;
        log.info("close----" + chars);
    }
}
