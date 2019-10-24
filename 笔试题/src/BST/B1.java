package BST;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/23 0023 - 下午 22:43
 */
public class B1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] split = s.split(" ");
        for(int i=split.length-1;i>0;i--){
            System.out.print(split[i]+" ");
        }
        System.out.print(split[0]);
    }
}
