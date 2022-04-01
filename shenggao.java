package constant;
import java.util.Scanner;

public class shenggao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        int z = sc.nextInt();
        int max1=(x>y)?x:y;
        int max2=(x>z)?x:z;
        System.out.println("max="+max2);


    }

    }