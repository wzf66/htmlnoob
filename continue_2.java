package disanzhang;

public class continue_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || j == 10) {
                    //continue;
                    break ;
                }
                System.out.print(j+"排"+i+"列，");
            }
            System.out.println();
        }
    }
}
