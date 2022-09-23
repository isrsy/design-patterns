package adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: rensiyu
 * @createTime: 2022/09/22
 */
@Slf4j
public class RowingBoat implements Rowing {
    @Override
    public void row() {
        log.info("船长的船坏了，会翻船的！！");
    }
}
