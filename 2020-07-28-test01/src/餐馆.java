import java.util.*;

public class 餐馆 {
    public static void rans(int n,int m,int[] arr_a,int[][] arr_b_c){
        int sumMax=0;
        int cnt=0;
        Arrays.sort(arr_a);//桌子容量大小--从小到大升序排列
        int[] arr_money=new int[m];//存放消费金额
        int[] arr_people=new int[m];//存放人数
        for(int i=0;i<arr_b_c.length;i++){
            arr_people[i]=arr_b_c[i][0];
            arr_money[i]=arr_b_c[i][1];
        }

        //对消费金额高的客户寻找合适的桌子
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++){
                Arrays.sort(arr_money);
                int k=arr_money[m-1];
                //问题出现在这
                if(arr_b_c[j][1]==k){
                    if(arr_b_c[j][0]<arr_a[i]){
                        sumMax+=k;
                        arr_money[m-1]=0;
                    }
                }
            }
        }
        System.out.println(sumMax);
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] arr_a=new int[n];
        for(int i=0;i<n;i++){
            arr_a[i]=scanner.nextInt();
        }
        int[][] arr_b_c=new int[m][2];
        for(int j=0;j<m;j++){
            arr_b_c[j][0]=scanner.nextInt();
            arr_b_c[j][1]=scanner.nextInt();
        }

        rans(n,m,arr_a,arr_b_c);
    }
}

/**
 输入-输出
 3 5 2 4 2 1 3 3 5 3 7 5 9 1 10
 20
 */
