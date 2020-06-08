package question_2;

/**
 *
 * 懒汉模式
 * @author GHOSTLaycoo
 * @date 2020/1/13 0013 - 下午 19:35
 */
public class Singleton1 {
    private static Singleton1 Instance = null;

    public static Singleton1 getInstance() {
        if(Instance==null){
            Instance = new Singleton1();
        }
        return Instance;
    }
}
