package disanzhang;

public class break_3 {
    public static void main(String[] args) {
        int num = 0;
        a:
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                num++;
                if (i == 2 && j == 5) {
                    break a;
                }
                System.out.println("第一" + i + "排,第" + j + "列：" + num);
            }
        }
    }
}



