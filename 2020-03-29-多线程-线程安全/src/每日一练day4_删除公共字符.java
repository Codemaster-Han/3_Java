import java.util.Scanner;

public class 每日一练day4_删除公共字符 {

    public static  String deletePublicCharacter(String st1,String st2){
        for(int i=0;i<st1.length();i++){
            for(int j=0;j<st2.length();j++){
                if(st1.charAt(i)==st2.charAt(j)){
                    st1=st1.replace(st1.charAt(i),' ');
                }
            }
        }
        return  st1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  str1=sc.nextLine();//they are students     aeiou
        String  str2=sc.nextLine();
        System.out.println(deletePublicCharacter(str1,str2));

    }
}
