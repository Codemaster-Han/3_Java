import java.util.Scanner;

public class day42_字符串加解密 {
    //实现字符串-加密-并输出
    public static void Encrypt(char[] aucPassword,char[] aucResult) {
        char[] ch1={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] ch2={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] ch3={'0','1','2','3','4','5','6','7','8','9'};
        for(int i=0;i<aucPassword.length;i++){
            if(aucPassword[i]>='a'&&aucPassword[i]<='z'){
                if(aucPassword[i]=='z'){
                    aucPassword[i]='A';
                }else {
                    aucPassword[i]=ch2[i+1];
                }
            }else if(aucPassword[i]>='A'&&aucPassword[i]<='Z'){
                if(aucPassword[i]=='Z'){
                    aucPassword[i]='a';
                }else {
                    aucPassword[i]=ch1[i+1];
                }
            }else if(aucPassword[i]>='0'&&aucPassword[i]<='9'){
                if(aucPassword[i]=='9'){
                    aucPassword[i]='0';
                }else {
                    aucPassword[i]=ch3[i+1];
                }
            }
        }
        System.out.println(aucPassword);
    }
    //实现字符串-解密-并输出
    public static void unEncrypt(char[] result,char[] password) {
        char[] ch1={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] ch2={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] ch3={'0','1','2','3','4','5','6','7','8','9'};
        for(int i=0;i<result.length;i++){
            if(result[i]>='A'&&result[i]<='Z'){
                if(i==0){
                    if(result[i]=='A'){
                        result[i]='z';
                    }else {
                        result[i]=ch1[i+1];
                    }
                }else {
                    if(result[i]=='A'){
                        result[i]='z';
                    }else {
                        result[i]=ch1[i-1];
                    }
                }
            }else if(result[i]>='0'&&result[i]<='9'){
                if(result[i]=='0'){
                    result[i]='9';
                }else {
                    result[i]=ch3[i-1];
                }
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String st1=scanner.nextLine();//要进行加密的
        String st2=scanner.nextLine();//要进行解密的
        char[] ch1=st1.toCharArray();
        char[] ch2=st2.toCharArray();
        Encrypt(ch1,ch2);//加密结果
        unEncrypt(ch2,ch1);//解密结果
    }
}
