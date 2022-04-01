package disanzhang;

import java.util.Random;
import java.util.Scanner;

public class Random_2 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner a = new Scanner(System.in);
        int x = r.nextInt(100) + 1;
        System.out.println("请输入你猜的数：");
        //int b = a.nextInt();
        for (int j = 1; j <= 100; j++) {
            int b = a.nextInt();
            if (b > x) {
                System.out.println("猜大了");
                continue;
            }
            if (b < x) {
                System.out.println("猜小了");
                continue;
            }
            if (b == x) {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
