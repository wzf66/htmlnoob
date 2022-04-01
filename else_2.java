package disanzhang;

import java.util.Scanner;

public class else_2 {
    public static void main(String[] args) {
        System.out.println("多少分");
        Scanner sc = new Scanner(System.in);
        System.out.println("逆子，你的分数：");
        int a=sc.nextInt();

        if (a>=90){
            System.out.println("送一套房子");
        }
        else if (a>=70&&a<=90){
            System.out.println("送车子");
        }
        else if (a>=60&&a<=70){
            System.out.println("送最爱的大逼斗子和七匹狼皮带");
        }
        else {
            System.out.println("有逆骨，断绝父子关系 送孤儿院");
        }

    }
}
