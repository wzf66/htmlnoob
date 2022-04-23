package dishizhang;

import java.util.Scanner;

public class k_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三个数");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=(a>b? a:b)>c?(a>b?a:b):c;
        int min=(a<b?a:b)<c?(a<b?a:c):c;

        System.out.println(min+ "<"+(a+b+c-max-min)+ "<"+max);
    }

}
