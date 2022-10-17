package callback;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: rensiyu
 * @createTime: 2022/09/27
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        new SimpleTask().executeWith(() -> log.info("执行callback"));
    }
}
