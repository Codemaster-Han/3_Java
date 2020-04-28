package 每日一题;
//剑指off上的一个题
public class day11_构建乘积数组 {
    public static int[] multiply(int[] A) {
          int[] B=new int[A.length];
          boolean changed=false;
          for(int k=0;k<B.length;k++){
              //A[k]=1;
              B[k]=1;
              for(int i=0;i<A.length;i++){
                 int tmp=1;
                 if(i==k){
                     changed=true;
                     tmp=A[i];//将之前的值保存起来，等i==k过后，又恢复正常，因此保证了A[i]==1;但没有破坏之前A里面的数
                     A[i]=1;
                 }
                 B[k]*=A[i];
                  if (changed==true) {
                      A[i]=tmp;
                      changed=false;
                  }
              }
          }
          return B;
    }

    public  static  void printshuzu(int[] B){
        for(int e:B){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5,6,7,8};
      printshuzu(multiply(arr));
    }
}
