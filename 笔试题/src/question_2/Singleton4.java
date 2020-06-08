package question_2;

/**
 * 饿汉模式
 * @author GHOSTLaycoo
 * @date 2020/1/13 0013 - 下午 20:19
 */
public class Singleton4 {
    private static Singleton4 Instance = new Singleton4();

    public static Singleton4 getInstance() {
        return Instance;
    }
}
