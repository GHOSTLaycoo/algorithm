package com.xi2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Test{
    public static List<String> result=new ArrayList<String>();
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        doWork(n,m,0,1,"");
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
    public static void doWork(int n,int m,int sum,int index,String r){
        for(int i=index;i<=n;i++){
            if(sum+i==m){
                result.add(r+i);
                break;
            }else if(sum+i<m){
                doWork(n,m,sum+i,i+1,r+i+" ");
            }else{
                break;
            }
        }
    }
}
