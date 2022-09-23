package templatemethod;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: rensiyu
 * @createTime: 2022/09/22
 */
@Slf4j
public class StringDisplay extends AbstractDisplay {
    private String str;

    @Override
    public void open() {
        str = "hhhhaaaa";
        log.info("open---" + str);
    }

    @Override
    public void print() {
        if (str != null) {
            log.info(str);
        }
    }

    @Override
    public void close() {
        str = "null";
        log.info("close---" + str);
    }
}
