import java.util.*;

public class Finder每日一练20200330 {
        public static int findKth(int[] a, int n, int K) {
            Arrays.sort(a);
            return a[n-K];
        }

    public static void main(String[] args) {
        int[] a= {1,3,5,2,2};
        int n=5;
        int K=3;
        System.out.println(findKth(a,n,K));
    }
}
