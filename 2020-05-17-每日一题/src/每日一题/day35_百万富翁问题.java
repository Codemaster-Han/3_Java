package 每日一题;

public class day35_百万富翁问题 {
    public static void main(String[] args) {
        int day=30;
        int richPeople=0;//万元
        int sPeople=0;//分
        int k=1;
        for(int i=0;i<day;i++){
            richPeople=richPeople+10;
            sPeople=sPeople+k;
            k=k*2;
        }
        System.out.println(richPeople+" "+sPeople);

    }
}
