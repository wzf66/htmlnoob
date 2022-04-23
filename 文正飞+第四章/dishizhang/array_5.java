package dishizhang;

import java.util.Scanner;

public class array_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double count = 0;

        double arr[] = new double[10];
        System.out.println("请输入10个数；");

        for (int i = 1; i < 10; i++)
        {
            arr[i] = sc.nextDouble();
            count += arr[i];
        }
        System.out.println("平均数为" + count / 10);
        System.out.println("其中大于平均分的是");

        for (int i = 0; i < 10; i++) {
            if (arr[i] > count) {
                System.out.println(arr[i] + "\t");
            }
        }
    }
}

