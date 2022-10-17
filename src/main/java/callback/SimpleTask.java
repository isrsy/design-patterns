package callback;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class SimpleTask extends Task {

    @Override
    public void execute() {
        log.info("执行简单任务.");
    }
}