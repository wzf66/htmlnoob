package dishizhang;

public class array_17 {
    public static void main(String[] args) {
        int arr[][]={{23,2,64,16},{35,56,97,28},{29,10,81,12}};
        int max=0;
      int x=-1,y=-1;
      for (int i=0;i<arr.length;i++){
          for (int j=0;j<arr[0].length;j++){
              if (arr[i][j]>max){
                  max=arr[i][j];
                  x=i;
                  y=j;
              }
              System.out.println(arr[i][j]+"\t");
          }
          System.out.println();
      }
        System.out.println("该二维数组中最大的值是"+max);
        System.out.println("位置是第"+x+"行，第"+y+"列");
    }
}
