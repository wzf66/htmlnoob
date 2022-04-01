package disanzhang;

import java.util.Scanner;

public class for_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入");
        int line = sc.nextInt();
        if (line <= 1) {
            System.out.println("大于一");
        } else {
            int i, j;
            for (i = 1; i <= line; i++) {
                for (j = 1; j <= line - i; j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
