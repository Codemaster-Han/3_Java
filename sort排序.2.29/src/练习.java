import java.util.Arrays;

public class 练习 {
    public static int[] sortArrayByParity(int[] A) {
        int len=A.length;
        int i=0,j=len-1;
        //用双指针
        while(i<=j){
            //前面为偶数，后面为奇数  不用交换
            if(((A[i])%2==0)&&((A[j])%2!=0)){
                i++;
                j--;
            }else if((A[i]%2!=0)&&(A[j]%2==0)){//前面为奇数，后面为偶数数  交换
                int tmp=0;
                tmp=A[i];
                A[i]=A[j];
                A[j]=tmp;
                i++;
                j--;
            }else if((A[i]%2!=0)&&(A[j]%2!=0)){//前后都为奇数  交换
                int tep=0;
                j=j-1;
                tep=A[i];
                A[i]=A[j];
                A[j]=tep;
                i++;
                j--;
            }else if((A[i]%2==0)&&(A[j]%2==0)){//前后都为偶数  交换
                int tp=0;
                i=i+1;
                tp=A[i];
                A[i]=A[j];
                A[j]=tp;
                i++;
                j--;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A={1,3,2,4};
        System.out.println( Arrays.toString(sortArrayByParity (A)));
    }
}

