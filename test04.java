package test;

import java.util.Random;
import java.util.Scanner;

public class test04{
    public static void main(String[] args) {
    	Scanner console=new Scanner(System.in);
    	System.out.println("请输入随机数最大值的范围：");
    	int z=console.nextInt();
    	System.out.println("请输入您要产生的随机数个数：");
    	int n=console.nextInt();
    	console.close();
        Random i=new Random();
        for(int k=0;k<=n-1;k++) {
        	System.out.println(i.nextInt(z));
        }
    }
}
