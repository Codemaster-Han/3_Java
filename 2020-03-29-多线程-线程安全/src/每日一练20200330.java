import java.util.Scanner;

public class 每日一练20200330 {
    public  static  boolean judgeString(String st){
        char[] st3=st.toCharArray();
        int left=0;
        int right=st3.length-1;
        int flag=0;
        while(left<right){
            if(st3[left]==st3[right]){
                flag++;
            }
            left++;
            right--;
        }
        if(flag==(st3.length/2)){
            return  true;
        }else{
            return  false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        int cnt=0;
        while(scanner1.hasNextLine()){
            String st1=scanner1.nextLine();
            String st2=scanner1.nextLine();

           // int cnt=0;
            for(int i=0;i<=st1.length();i++){
                StringBuilder st3=new StringBuilder(st1);
                st3.insert(i,st2);
                if(judgeString(st3.toString())) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
