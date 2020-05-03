package 每日一题;

import java.util.Scanner;

//学会如何操作Sttring 里面的字母
public class day21_最难的问题 {
    public  static  void  problem(String  st){
         char[] ch=st.toCharArray();
         for(int i=0;i<ch.length;i++){
             if(ch[i]==' '){
                 i++;
             }
             if('A'<=ch[i]&&ch[i]<='E'){
                 ch[i]=(char)(ch[i]+21);//类型强转
             }else {
                 ch[i]=(char)(ch[i]-5);
             }
         }
         for(char e:ch){
             System.out.print(e);
         }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.nextLine();
            problem(str);//解密后结果
            System.out.printf("\n");//-----------------注意这里，不然会报错，空格和换行与输出不一致
        }
    }
    //输入
    //HELLO WORLD
    //SNHJ

    //输出
    //CZGGJ RJMGY
    //NICE
}
