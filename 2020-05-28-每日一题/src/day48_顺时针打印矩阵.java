public class day48_顺时针打印矩阵 {
    public int[] clockwisePrint(int[][] mat, int n, int m) {
        int[] res=new int[n*m];
        int x=0;
        //只有一行
        if(n==1){
            for(int i=0;i<m;i++){
                res[i]=mat[0][i];
            }
            return res;
        }
        //只有一列
        if(m==1){
            for(int i=0;i<n;i++){
                res[i]=mat[i][0];
            }
            return res;
        }
        //多行多列
        int left=0;
        int right=m-1;
        int low=0;
        int high=n-1;
        while (left<=right&&low<=high){
            //从左往右
            for(int i=left;i<=right;i++){
                res[x++]=mat[low][i];
            }
            //从上往下
            for(int j=low+1;j<=high;j++){
                res[x++]=mat[j][right];
            }
            //排除只剩下一行的情况
            //从右往左
            if(high!=low){
                for(int k=right-1;k>=left;k--){
                    res[x++]=mat[high][k];
                }
            }
            //排除只剩下一列的情况
            //从下往上
            if(right!=left){
                for(int w=high-1;w>=low+1;w--){
                    res[x++]=mat[w][left];
                }
            }
            left++;
            right--;
            low++;
            high--;
        }
        return res;
    }

    /*
    public int[] clockwisePrint(int[][] mat, int n, int m) {
        //用双指针
        int x=0;
        int y=0;
        int[] arr=new int[n*m];
        for(int i=0;i<arr.length;i++){
            if(i<n){
                arr[i]=mat[x][y];
                y++;
            }else {
                if(i==n){
                    x++;
                }
                y--;
                arr[i]=mat[x][y];
            }
        }
        return arr;
    }
    */

    public static void main(String[] args) {
        day48_顺时针打印矩阵 cc=new day48_顺时针打印矩阵();
        int[][] mat={{1,2},{3,4}};
        int n=2;
        int m=2;//n行m列
        int[] arr=cc.clockwisePrint(mat,n,m);
        for(int e: arr){
            System.out.print(e+" ");
        }
    }
}
