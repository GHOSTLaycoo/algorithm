package question_2;

/**
 * @author GHOSTLaycoo
 * @date 2020/1/13 0013 - 下午 19:39
 */
public class Test {
    public static void main(String[] args) {
        Singleton1 singleton1 = new Singleton1();
        System.out.println(singleton1.getInstance());
        System.out.println(singleton1.getInstance());
    }
}
