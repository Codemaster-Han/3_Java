package 每日一题;
import java.util.Scanner;

public class day27_整数与IP地址之间的转换 {
    //IP地址转换成十进制的地址      过程(IP地址->分割后变整数->2进制->10进制)
    public  static  void  IpShiftTen(String st){
        String[] s=st.split("\\.");//按照点进行分割，得到四个字符串；  //10.0.3.193
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<4;i++){
            String t=Integer.toBinaryString(Integer.parseInt(s[i]));//整形整数转换成二进制
            //parseInt(String s)-------------将字符串参数解析为带符号的十进制整数。
            //toBinaryString(int i)----------将整数编程二进制。
            if(t.length()<8){ //由于如果高位为0，会缺省，所以需要自行补充高位缺失的0
                int diff=8-t.length();
                StringBuilder sx=new StringBuilder();
                for(int j=0;j<diff;j++){
                    sx.append("0");
                }
                t=sx.toString()+t;
            }
            sb.append(t);
        }
        long res=Long.parseLong(sb.toString(),2);//得到此二进制对应的十进制数
        //parseLong(String s, int radix)---------------将2进制的字符串s转换为10进制的long型。
        System.out.println(res);
    }

    //十进制的地址转换成IP地址
    public  static  void  TenShiftIp(String p){
         String bin=Long.toBinaryString(Long.parseLong(p));//长整型整数转为二进制       // 167969729
         if(bin.length()<32){
             int diff=32-bin.length();
             StringBuilder sb=new StringBuilder();
             for(int i=0;i<diff;i++){
                 sb.append("0");
             }
             bin=sb.toString()+bin;
         }
         String[] four=new String[4];
         four[0]=bin.substring(0,8);//取得每个部分
         four[1]=bin.substring(8,16);
         four[2]=bin.substring(16,24);
         four[3]=bin.substring(24,32);
         StringBuilder s=new StringBuilder();
         for(int i=0;i<4;i++){
             s.append(Integer.parseInt(four[i],2));//将字符串转换为10进制的数
             if(i!=3){
                s.append(".");
             }
         }
        System.out.println(s.toString());

    }
    //main函数
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String st=scanner.nextLine();//输入IP地址
            String p=scanner.nextLine();//输入10进制型的IP地址
            IpShiftTen(st);
            TenShiftIp(p);
        }
    }
}

//学会整数和二进制的转换
//遇到的问题：数组越界，输入格式不正确，应该都为String类型的输入----int型会移除，要换为Long型

//如果用“.”作为分隔的话必须是如下写法String.split("\\."),这样才能正确的分隔开    不能用String.split(".");
//转义字符前需要\\

//ip地址转为十进制IP地址
//1. 按.分割，得到4个字符串 -> 整数
//2.通过Integer.toBinaryString(Integer.parseInt(s[i])) 得到每个整数对应的二进制序列，如果长度不为8需要自行在前面加0
//3.组合每个数的二进制序列，然后通过Long.parseLong(sb.toString(), 2)得到此二进制对应的十进制数


//十进制IP地址转为IP地址
//1.通过Long.toBinaryString(Long.parseLong(ip10))得到此十进制IP地址对应的二进制序列，不足32时需要自行在高位补0
//2.每隔8个比特位进行划分，共得到4部分
//3.每部分分别通过Integer.parseInt(four[i], 2)得到对应十进制数，然后用.连接得到最终的IP地址

/*
输入
10.0.3.193
167969729


输出
167773121
10.3.3.193
 */