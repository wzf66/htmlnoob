package disanzhang;

import java.util.Random;

public class Random_1 {
    public static void main(String[] args) {
        //创建对象
        Random r=new Random();
        //用循环获取十个随机数
        for (int i=0;i<=10;i++){
            int num=r.nextInt(10);
            System.out.println("num"+num);
        }
        //获取一个1-100之间的随机数
        int x=r.nextInt(100)+1;
        System.out.println(x);
    }
}
