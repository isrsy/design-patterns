package state;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 */
public interface State {
    void Handle(Context context);
}
