package dishizhang;

import java.util.Arrays;

public class array_8 {
    public static void main(String[] args) {
        int[]arr=new int[5];
        Arrays.fill(arr,8);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int []arr2={1,2,3,4,5,6,7,8,9};
        Arrays.fill(arr2,1,4,0);
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
