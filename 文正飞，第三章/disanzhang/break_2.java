package disanzhang;

public class break_2 {
    public static void main(String[] args) {
        loop:
        for (int i = 0; i < 3; i++)
        //for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 6; j++) {
                if (j == 4) {
                    break loop;
                }
                System.out.println("i=" + i + "j=" + j);
            }
        }
    }
    //break;
}

