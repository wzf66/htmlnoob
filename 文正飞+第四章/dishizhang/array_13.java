package dishizhang;

public class array_13 {
    public static void main(String[] args) {
        String arr[] = {"西游记", "鹿鼎记", "红楼梦", null, null};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = "水浒传";

                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
