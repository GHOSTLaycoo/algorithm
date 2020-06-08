package question_2;

/**
 * 懒汉模式-线程安全优化
 * @author GHOSTLaycoo
 * @date 2020/1/13 0013 - 下午 20:16
 */
public class Singleton3 {
    private static Singleton1 Instance = null;

    public static Singleton1 getInstance() {
        //当已有实例时直接跳过,不调线程
        if(Instance==null) {
            synchronized (Singleton1.class) {
                if (Instance == null) {
                    Instance = new Singleton1();
                }
            }
        }
        return Instance;
    }
}
