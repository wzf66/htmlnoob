package dishizhang;

import java.util.Scanner;

public class array_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double count=0;
        double arr[] = new double[10];
        System.out.println("请输入10个数；");

        for (int b = 1; b < 10; b++) {
            arr[b] = sc.nextDouble();
            count += arr[b];

            System.out.println("平均数为" + b / 10);
            System.out.println("其中大于平均分的是");
        }
        for (int b = 0; b < 10; b++) {
            if (arr[b] > count) {
                System.out.println(arr[b] + "\t");
            }
        }
    }
}

