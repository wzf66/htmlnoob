package disanzhang;

public class for_3 {
    public static void main(String[] args) {
        int b = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                b += i;
            }
        }

        System.out.println("偶数和" + b);

    }
}
