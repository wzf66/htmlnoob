package dishizhang;

public class array_11 {
    public static void main(String[] args) {//找下标
        int sort[] = {1, 2, 3, 4, 5, 6,7, 8, 9};
        int key = 6;
        int locale = -1;
        int low = 0;
        int high = sort.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < sort[mid])
                high = mid - 1;
            else if (key == sort[mid]) {
                locale = mid;
                break;
            } else
                low = mid + 1;
        }
        if (locale == -1)
            System.out.println("数组中不存在元素" + key);
        else
            System.out.println("元素" + key + "在数组中的下标是" + locale);
    }
}
