package 每日一题;

import java.util.ArrayList;
import java.util.Scanner;

public class day24_最高分是多少 {
    public static void maxSocor(ArrayList<String> find,int n,int m,int[] arrID){
        for(int i=0;i<m;i++){
            String str=find.get(i);
            char[] ch=str.toCharArray();
            {
                int A=ch[2]-'0';
                int B=ch[4]-'0';
                if(ch[0]=='Q'){  //查询  从A-B中成绩最高的是多少
                    System.out.println(Max(arrID,A,B));
                }else if(ch[0]=='U'){  //更新  将ID为A的学生成绩=B;
                    arrID[A]=B;
                }
            }
        }
    }
    public static  int Max(int[] arrID,int A,int B){
        int max=0;
        for(int i=A;i<B;i++){  //学生ID=   0 1 2 3 4
            if(max<arrID[i]){
                max=arrID[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int N=scanner.nextInt();//学生数目--5个
            int M=scanner.nextInt();//操作数目--7次
            int[] arrID=new int[N];
            for(int i=0;i<N;i++){
                arrID[i]=scanner.nextInt();//初始成绩
            }
            scanner.nextLine();
            ArrayList<String> find=new ArrayList<String>();
            for(int j=0;j<M;j++){
                String st=scanner.nextLine();
                find.add(j,st);
            }
            maxSocor(find,N,M,arrID);
        }
    }
}

/*
输入
5 7
1 2 3 4 5
Q 1 5
U 3 6
Q 3 4
Q 4 5
U 4 5
U 2 9
Q 1 5

输出
5
6
5
9

 */