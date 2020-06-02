import java.util.Scanner;

public class day41_坐标移动 {
    public static void move(String st){
      String[] str=st.split(";");
      int x=0;
      int y=0;
      for(String string:str){
          if(string.length()<=3){
              if(string.charAt(0)=='A'&&string.substring(1).matches("[0-9]+")){
                  x-=Integer.parseInt(string.substring(1));
              }
              if(string.charAt(0)=='D'&&string.substring(1).matches("[0-9]+")){
                  x+=Integer.parseInt(string.substring(1));
              }
              if(string.charAt(0)=='W'&&string.substring(1).matches("[0-9]+")){
                  y-=Integer.parseInt(string.substring(1));
              }
              if(string.charAt(0)=='S'&&string.substring(1).matches("[0-9]+")){
                  y+=Integer.parseInt(string.substring(1));
              }
          }
      }
       /*
      for(int i=0;i<str.length;i++){
          String ss=str[i];
          if(ss.substring(1,2)==" "){
              i++;
          }
          int tmp=Integer.parseInt(ss.substring(1,ss.length()));
          if(ss.substring(0,1)=="A"&&tmp>=0){
              x-=tmp;
          }else if(ss.substring(0,1)=="D"&&tmp>=0){
              x+=tmp;
          }else if(ss.substring(0,1)=="W"&&tmp>=0){
              y+=tmp;
          }else if(ss.substring(0,1)=="S"&&tmp>=0){
              y-=tmp;
          }
      }
      */
        System.out.println(x+","+y);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String st=scanner.nextLine();// A10;S20;W10;D30;X;A1A;B10A11;;A10;
        move(st);//10,-10
    }
}
