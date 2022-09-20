package proxy;

/**
 * @author: rensiyu
 * @createTime: 2022/05/18 4:19 PM
 * @description: 增强类
 */
public class MyTransaction {
    public void beginTransaction() {
        System.out.println("开启事物");
    }

    public void commit() {
        System.out.println("提交事物");
    }
}
