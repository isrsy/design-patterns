package pipeline2.model;

import lombok.Builder;

/**
 * @author: rensiyu
 * @createTime: 2022/09/21
 */

@Builder
public class ResultImpl implements Result {
    private Integer code;
    private String message;

    public ResultImpl(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }


    @Override
    public String getMessage() {
        return this.message;
    }

    public static Result ok() {
        return ok(null);
    }

    public static Result ok(String message) {
        return ResultImpl.builder()
                         .code(0)
                         .message(message)
                         .build();
    }

    public static Result fail(String message) {
        return ResultImpl.builder()
                         .code(-1)
                         .message(message)
                         .build();
    }
}
