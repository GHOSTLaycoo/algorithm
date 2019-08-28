package com.xi2;


import java.io.File;
import java.io.IOException;


/**
 * @author GHOSTLaycoo
 * @date 2019/8/9 0009 - 下午 17:45
 */
public class WalkTree {
    public static void main(String[] args) throws IOException {
        WalkTree w = new WalkTree();
        String path = "C:\\Users\\Administrator\\Desktop\\其他";
        String key = "C:\\Users\\Administrator\\Desktop\\其他\\大大大";
        boolean a = w.traverseFolder2(path,key);
        System.out.println(a);
    }

    public boolean traverseFolder2(String path,String key) {
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (null == files || files.length == 0) {
                System.out.println("文件夹是空的!");
                return false;
            } else {
                for (File file2 : files) {
                    if(file2.getAbsolutePath().equals(key)){
                        if (file2.isDirectory()) {
                            System.out.println("文件夹:" + file2.getAbsolutePath());
                            traverseFolder2(file2.getAbsolutePath(),key);
                        } else {
                            System.out.println("文件:" + file2.getAbsolutePath());
                        }
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
        return true;
    }

}
