import java.util.Scanner;

public class day45_乒乓球框 {
    public static void find(String a,String b){
        char[] arrA=a.toCharArray();
        char[] arrB=b.toCharArray();
        for(int i=0;i<b.length();i++){
            for(int j=0;j<a.length();j++){
                if(arrB[i]==arrA[j]){  //如果两个字母相同，则将其置1
                    arrB[i]=arrA[j]='1';
                    break;
                }
            }
        }
        int k=0;
        for(;k<arrB.length;k++){
            if(arrB[k]!='1'){
                System.out.println("No");
                break;
            }
        }

        if(k>=arrB.length){
            System.out.println("Yes");
        }
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (scanner.hasNext()){
            String st=scanner.nextLine();
            String[] str=st.split(" ");
            String a=str[0];
            String b=str[1];
            find(a,b);
        }
    }
}


/*
输入
ABCDFYE CDE
输出
Yes
输入
ABCDGEAS CDECDE
输出
No
 */