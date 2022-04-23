package dishizhang;

public class array_7 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        for (int x:arr)sum+=x;//两个for一样的
        System.out.println(sum);
    }
}
