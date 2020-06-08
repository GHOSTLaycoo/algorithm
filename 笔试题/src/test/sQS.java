package test;

/**
 * @author GHOSTLaycoo
 * @date 2020/4/3 0003 - 下午 16:39
 */
public class sQS {
    public static void main(String[] args) {
        String s = "{'ddawda':dawd,'dawda':'dwdaw'}";
        String changsda = changsda(s);
        System.out.println(changsda);
    }

    private static String changsda(String s){
        s.substring(s.indexOf("{\'"),s.indexOf("\'}"));
        return s;
    }
}
