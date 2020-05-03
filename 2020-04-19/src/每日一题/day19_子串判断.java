package 每日一题;

public class day19_子串判断 {
   public static boolean[] chkSubStr(String[] p, int n, String s) {
      boolean[] boolArr=new boolean[n];
      char[] ch1=new char[n];
      char[] ch2=s.toCharArray();
      //先将p存入，再判断
      for(int i=0;i<n;i++){
          ch1[i]=p[i].toCharArray()[0];
          for(int j=0;j<ch2.length;j++){
              if(ch1[i]==ch2[j]){
                  boolArr[i]=true;//其原本默认是false
              }
          }
      }
       for(boolean a:boolArr){
           System.out.println(a);
       }
      return  boolArr;
   }
    public static boolean[] chkSubStr2(String[] p, int n, String s) {
        boolean[] boolArr=new boolean[n];
        char[] ch1=new char[n];
        //先将p存入，再判断
        for(int i=0;i<n;i++){
            ch1[i]=p[i].toCharArray()[0];
            if(s.contains(p[i])){  //用contains方法判断是否包含
                boolArr[i]=true;
            }else {
                boolArr[i]=false;
            }
        }
        for(boolean a:boolArr){
            System.out.println(a);
        }
        return  boolArr;
    }

    public static void main(String[] args) {
           String[] p={"a","b","c","d"};
           int n=p.length;
           String s="abc";
           chkSubStr(p,n,s);
        System.out.println("------");
           chkSubStr2(p,n,s);
    }
}
