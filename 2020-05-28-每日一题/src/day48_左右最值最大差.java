import java.util.*;
public class day48_左右最值最大差 {
    public  int findMaxGap(int[] A, int n) {
        //  0<=k<=n-2
        //A左边部分  [0,k]   最大值 maxLeft
        //A右边部分  [k+1,n-1]   最大值  maxRight
        //绝对值  max=|maxLeft-maxRight|
        int[] arr2=new int[n-1];//存放每一组划分的最大值
        for(int k=0;k<=n-2;k++){
            int maxLeft=0;
            int maxRight=0;
            int max=0;
            int[] left=Arrays.copyOfRange(A,0,k+1);
            int[] right=Arrays.copyOfRange(A,k+1,n);
            Arrays.sort(left);
            maxLeft=left[k];
            Arrays.sort(right);
            maxRight=right[n-1-k-1];
            max=maxLeft-maxRight;
            if(max<0){
                max=(-1)*max;
            }
            arr2[k]=max;
        }
        Arrays.sort(arr2);
        return arr2[n-2];
    }

    public static void main(String[] args) {
        int[] arr={2,7,3,1,1};
        int n=arr.length;
        day48_左右最值最大差 ff=new day48_左右最值最大差();
        int max=ff.findMaxGap(arr,n);
        System.out.println(max);
    }

}
