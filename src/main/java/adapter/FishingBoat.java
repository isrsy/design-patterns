package adapter;

import lombok.extern.slf4j.Slf4j;


/**
 * @author: rensiyu
 * @createTime: 2022/09/22
 */
@Slf4j
public class FishingBoat implements Sailing {
    @Override
    public void sail() {
        log.info("船开走了！！");
    }
}
