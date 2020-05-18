package 每日一题;
import java.util.Scanner;

/**
 * 这题的输入太坑了，居然连多少行都不告诉，不仅如此连个输入结束符都没有，scanner.hasNext()会阻塞等待输入，
 * 导致行数不确定时根本无法结束输入进行下一步处理。如果直接回车\n将继续阻塞，下面的代码在牛客上通过测试，
 * 在本地根本就是一直阻塞着等待输入，不知道测试用例到底是怎么输入的，坑死了。
 * 思路：先根据输入一条一条记录下来，相同记录只需要记数加1，输入处理结束后进行一次排序，随后输入小8条记录即可，注意文件名长度不能大于16。
 */
public class day31_简单错误记录 {
    public static void errorRecord(String st){
        String[] newSt=st.split("\\\\");//用反斜杠划分字符串需要转移
        int cnt=0;
        int len=newSt.length-1;
        String ss=newSt[len];
        for(int i=0;i<ss.length();i++){
            if(ss.charAt(i)==' '){
                cnt++;
            }
        }
        System.out.println(ss+" "+cnt);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String st=scanner.nextLine();//   E:\V1R2\product\fpgadrive.c 1325
            errorRecord(st);//   fpgadrive.c 1325 1
        }
    }

}
