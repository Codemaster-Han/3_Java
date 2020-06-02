import java.util.Scanner;

public class day43_求和 {
    public static void sum(int n,int m){
         for(int j=1;j<=n;j++){
             for(int k=j;k<=n;k++){
                if((j+k)==m){
                    System.out.println(j+" "+k);
                    break;
                }
             }
         }
         if(n==m){
             System.out.println(n);

         }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            sum(n,m);
        }
    }
}
