package disanzhang;

public class for_5 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        for (int i = 0; i <= 10; i++) {
            if (i == 1 || i == 2) {
                System.out.println(1 + "");
            } else {
                int c = num1 + num2;
                num1 = num2;
                num2 = c;
                System.out.println(c + "");
            }
        }
    }
}
