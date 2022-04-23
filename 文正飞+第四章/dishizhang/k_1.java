package dishizhang;

import java.util.Random;

public class k_1 {
    public static void main(String[] args) {
        Random sc=new Random();
        int i=sc.nextInt(1000) ;
            int a=i%10;
            int b=(i%100)/10;
            int c=i/100;
        System.out.println("随机数"+i);
            System.out.println("个位"+c);
            System.out.println("十位"+b);
            System.out.println("百位"+a);
        }

    }

