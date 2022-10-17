package prototype;

import lombok.SneakyThrows;

public abstract class Prototype<T> implements Cloneable {
    public T copy() {
        try {
            System.out.println("克隆对象" + this);
            return (T) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}