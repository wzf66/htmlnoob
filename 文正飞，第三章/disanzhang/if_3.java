package disanzhang;

import java.util.Scanner;

public class if_3 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("请输入判断的整数:");
        int B = A.nextInt();
        if (B % 2 == 0) {
            System.out.println("是偶数");
        }
        if (B % 2 != 0) {
            System.out.println("是奇数");
        }
    }}
