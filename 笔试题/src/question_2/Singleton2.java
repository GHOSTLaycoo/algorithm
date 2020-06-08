package question_2;

/**
 * 懒汉模式线程安全
 * @author GHOSTLaycoo
 * @date 2020/1/13 0013 - 下午 19:44
 */
public class Singleton2 {
    private static Singleton1 Instance = null;

    public static Singleton1 getInstance() {
            synchronized (Singleton1.class){
                if(Instance==null){
                    Instance = new Singleton1();
                }
            }
        return Instance;
    }
}
