package dishizhang;

public class array_9 {
    public static void main(String[] args) {
        int aa[]={1,2,3,4,5};
        int bb[]={6,7,8,9,10,11,12,13,14,15};
        System.arraycopy(aa,0,bb,0,5);//从aa零开始复制到bb里面去从零开始，复制五个数
        for (int i=0;i<aa.length;i++){
            System.out.println(aa[i]+"");
        }
        System.out.println();
        for (int j=0;j<bb.length;j++){
            System.out.println(bb[j]+"");
        }
        System.out.println();
    }
}
