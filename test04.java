package test;

import java.util.Random;
import java.util.Scanner;

public class test04{
    public static void main(String[] args) {
    	Scanner console=new Scanner(System.in);
    	System.out.println("��������������ֵ�ķ�Χ��");
    	int z=console.nextInt();
    	System.out.println("��������Ҫ�����������������");
    	int n=console.nextInt();
    	console.close();
        Random i=new Random();
        for(int k=0;k<=n-1;k++) {
        	System.out.println(i.nextInt(z));
        }
    }
}
