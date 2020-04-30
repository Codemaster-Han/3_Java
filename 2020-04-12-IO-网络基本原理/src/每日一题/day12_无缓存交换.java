package 每日一题;

public class day12_无缓存交换 {
    public static int[] exchangeAB(int[] AB) {
        AB[0]=AB[0]^AB[1] ;
        AB[1]=AB[0]^AB[1];
        AB[0]=AB[0]^AB[1];
        return AB;
    }
    public static void main(String[] args) {
        int[] arr={1,2};
        exchangeAB(arr);
        System.out.println(arr[0]+"交换后"+arr[1]);
    }
}
