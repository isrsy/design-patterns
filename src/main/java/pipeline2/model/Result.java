package pipeline2.model;

import com.sun.istack.internal.Nullable;

public interface Result {
    Integer getCode();

    @Nullable
    String getMessage();

}
