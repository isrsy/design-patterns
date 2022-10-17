package builder;

/**
 * @author: rensiyu
 * @createTime: 2022/10/17
 */
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero.Builder("rty").setAge(18).setSex(1).build();
        System.out.println(hero.toString());
    }
}
