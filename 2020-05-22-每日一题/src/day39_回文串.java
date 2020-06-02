import java.util.Scanner;

public class day39_回文串 {
    public static  void  huiWen(String st){
        int left=0;
        int right=st.length()-1;
        int cnt=0;
        while (left<=right){
            if(st.substring(left,left+1)==st.substring(right,right+1)){
                cnt++;
            }
            left++;
            right--;
        }
        if(cnt!=0){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String st=scanner.nextLine();//coco
        huiWen(st);//Yes
    }
}
