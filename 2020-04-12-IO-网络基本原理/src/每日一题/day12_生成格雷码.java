package 每日一题;
import java.util.*;

//解释：
//1的格林码是“0,1”
// 2的格林码是“00,01,10,11”
//3的格林码是“000，010，001,100,101,110,011,111”
public class day12_生成格雷码 {
    /**
     1---0  1
     2---00  01  11  10
     3---000  001  011  010  110  111  101  100
     4---0000  0001  0011  0010  0110  0111  0101  0100  1100  1101  1111  1110  1010  1011  1001  1000
     */
    public static  String[] getGray(int n) {
        if(n==1){
            String[] str={"0","1"};
            return  str;
        }else {
            String[] gray=getGray(n-1);
            int len=gray.length;
            String[] result=new String[len*2];
            for(int j=len-1;j>=0;j--){
                result[len++]="1"+gray[j];//len之后的给他左边补1   eg：10 11
                result[j]="0"+gray[j];//len之前的给他左边补0     eg：00 01
            }
            return  result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            String[] st=getGray(n);
            for(int i=0;i<st.length;i++){
                System.out.print(st[i]+"  ");
            }
        }
    }
}
