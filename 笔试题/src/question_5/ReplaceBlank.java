package question_5;

/**
 * @author GHOSTLaycoo
 * @date 2020/1/30 0030 - 上午 11:18
 */
public class ReplaceBlank {
    public static String replaceBlank(String str){
        StringBuffer strb = new StringBuffer(str);
        int len = strb.length();
        for(int i=0;i<len;i++){
            if(strb.charAt(i)==' '){
                strb.deleteCharAt(i);
                strb.insert(i,"%20");
                len+=2;
            }
        }
        return strb.toString();
    }

    public static void main(String[] args) {
        String str = "We are happy.";
        String s = replaceBlank(str);
        System.out.println(s);
    }
}
