package 每日一题;

import java.util.Scanner;

public class day16_洗牌 {
    public  static  void  shuffle(int[] arr1,int k1){
        //先分成左右手,再洗牌
        while (k1!=0){
            int left1=1,right1=arr1.length/2;
            for(int i=0;i<(arr1.length)/2-1;i++){
                if((left1<right1)&&(right1<arr1.length-1)){ //每一组第一个数和最后一个数保持不动
                    int tmp=arr1[left1];
                    arr1[left1]=arr1[right1];
                    arr1[right1]=tmp;
                    left1++;
                    right1++;
                }
            }
            int tmp=arr1[left1];
            arr1[left1]=arr1[left1-1];
            arr1[left1-1]=tmp;
            k1--;
        }
        for(int i=0;i<arr1.length;i++){
            if(i==arr1.length-1){
                System.out.print(arr1[i]);
            }else {
                System.out.print(arr1[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();//组数
        int n1=scanner.nextInt();//每组牌个数---第一组
        int k1=scanner.nextInt();//洗牌次数
        int[] arr1=new int[2*n1];
        for(int j=0;j<arr1.length;j++){
            arr1[j]=scanner.nextInt();
        }
        int n2=scanner.nextInt();//每组牌个数---第二组
        int k2=scanner.nextInt();//洗牌次数
        int[] arr2=new int[2*n2];
        for(int j=0;j<arr2.length;j++){
            arr2[j]=scanner.nextInt();
        }
        int n3=scanner.nextInt();//每组牌个数---第三组
        int k3=scanner.nextInt();//洗牌次数
        int[] arr3=new int[2*n3];
        for(int j=0;j<arr3.length;j++){
            arr3[j]=scanner.nextInt();
        }
        shuffle(arr1,k1);
        System.out.print(" ");
        shuffle(arr2,k2);
        System.out.print(" ");
        shuffle(arr3,k3);
    }
}
//  测试用例  3组 （n=3 k=1） 1 2 3 4 5 6   (n=3 k=2) 1 2 3 4 5 6    (n=2 k=2) 1 1 1 1
// （一共T=3组数，每一组数据第一行的两个数是 n=3（左手拿牌个数） k=1（洗牌次数），接下来一行有2n个数）
//  输入   3 3 1 1 2 3 4 5 6 3 2 1 2 3 4 5 6 2 2 1 1 1 1
//  输出  1 4 2 5 3 6 1 5 4 3 2 6 1 1 1 1     （对于这3组数据，每一组输出一行，用空格隔开，16个数据）
