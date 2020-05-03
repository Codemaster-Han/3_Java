package 每日一题;

public class day18_百万富翁 {
    public static void main(String[] args) {
        int m=100;//单位：万元  ---富翁
        int n=1;//单位：分  ----陌生人
        int j=1;
        int sumM=0;
        int sumN=0;
        for(int i=0;i<30;i++){
            sumM=sumM+10;
            sumN=sumN+j;
            j=j*2;
        }
        System.out.println(sumM+" "+sumN);
    }
}
