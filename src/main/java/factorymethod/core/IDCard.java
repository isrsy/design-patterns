package factorymethod.core;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: rensiyu
 * @createTime: 2022/09/22
 */
@Slf4j
public class IDCard extends Product {
    @Getter
    private String owner;

    public IDCard(String owner) {
        log.info("制作了" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        log.info(owner + "使用了ID卡");
    }
    
}
