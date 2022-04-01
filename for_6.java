package disanzhang;

import java.util.Scanner;

public class for_6 {
    public static void main(String[] args) {
        int num1=1,num2=1,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查看第n个数中的m值");
        int num=sc.nextInt();
        for (int i=2;i<num;i++){
            num1+=num2;
            temp=num1;
            num1=num2;
            num2=temp;
        }
        System.out.println("第"+num+"个数为"+num2);
    }
}
