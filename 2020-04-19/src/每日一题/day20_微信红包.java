package 每日一题;

import java.util.Arrays;
//学会这个cnt方法
public class day20_微信红包 {
    public static int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);//1 2 2 2 3
        int[] cnt=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(gifts[i]==gifts[j]){
                    cnt[i]=cnt[i]+1;
                }
            }
            if(cnt[i]>(n/2)){
                return  gifts[i];
            }
        }
        return  0;
    }
    public static void main(String[] args) {
        int[] gifts={1,2,3,2,2};
        int n=gifts.length;//5
        System.out.println(getValue(gifts, n));//2
    }
}
