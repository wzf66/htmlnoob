package dishizhang;

public class array_15 {
    public static void main(String[] args) {
        int arr1[][]={{1,3,5},{5,9,10}};
        int arr2[][]=new int [][]{{65,55,12},{92,7,2}};
        int arr3[][]=new int[2][3];
        //给第一行分配一个宿主
        arr3[0]=new int[]{6,54,71};
        arr3[1][0]=63;
        arr3[1][1]=10;
        arr3[1][2]=7;

        System.out.println(arr1[0][0]);
        System.out.println(arr1[0][1]);
        System.out.println(arr1[0][2]);


        System.out.println(arr3[0][0]);
        System.out.println(arr3[0][1]);
        System.out.println(arr3[0][2]);
        System.out.println(arr3[1][0]);
        System.out.println(arr3[1][1]);
        System.out.println(arr3[1][2]);
    }
}
