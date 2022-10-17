package builder;

import java.util.StringJoiner;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 */
public class Hero {
    private final String name;
    private final int age;
    private final int sex;

    public Hero(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Hero.class.getSimpleName() + "[", "]").add("name='" + name + "'")
                .add("age=" + age).add("sex=" + sex).toString();
    }

    public static class Builder {
        private final String name;
        private int age;
        private int sex;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setSex(int sex) {
            this.sex = sex;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}
