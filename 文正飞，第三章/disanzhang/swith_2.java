package disanzhang;

import java.util.Scanner;

public class swith_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int a = sc.nextInt();
        switch (a) {
            case 3:
            case 4:
            case 5:
                System.out.println(a+"月份为春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(a+"月份为夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(a+"月份为秋天");
                break;
            case 1:
            case 12:
            case 2:
                System.out.println(a+"月份为冬天");
                break;
            default:
                System.out.println("您输入无效");
        }
    }
}



