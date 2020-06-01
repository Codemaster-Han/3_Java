import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class two_下厨房 {
    public static int count(StringBuilder stb){
        int cnt=1;
        String[] stt=stb.toString().split(" ");
        int len=stt.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(!stt[j].equals(stt[i])){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder stb=new StringBuilder();
        if(scanner.hasNextLine()){
            //Map<Integer,String>=new ArrayList<>();
            String str=scanner.nextLine();
            stb=new StringBuilder();
            stb.append(str);
        }
        System.out.println(count(stb));
    }

}
