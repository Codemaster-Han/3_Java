import java.util.Scanner;

public class day42_计算日期到天数转换 {
    public static int iConverDateToDay(int year,int month,int day){
        int sum=0;
        int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};
        if(year<=0||month<=0||month>12||day<=0||day>arr[month-1]){
            return -1;
        }
        //如果是闰年 2月有29天  如果是平年2月是28天
        if(year%4==0&&year%100!=0||year%400==0){
            arr[1]=29;
        }
        for(int i=0;i<month-1;i++){
            sum+=arr[i];
        }
        return sum+day;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            int year=scanner.nextInt();
            int month=scanner.nextInt();
            int day=scanner.nextInt();
            System.out.println(iConverDateToDay(year,month,day));
        }
    }
}
