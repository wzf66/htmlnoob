package dishizhang;

import java.util.Scanner;

public class array_3 {
    public static void main(String[] args) {
       // Scanner e=new Scanner(System.in);
        System.out.println("请输入");
        int[]arr={12,45,98,73,60};
        int max=arr[0];
        for (int x=1;x<arr.length;x++){
            if (arr[x]>max){
                max=arr[x];
            }
        }
        System.out.println("max"+max);
    }
}
