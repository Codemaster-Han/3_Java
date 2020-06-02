import java.util.*;

/**
 * 解题思路
 * 用hash表存储字母和数字之间的映射关系
 * 每次读到一个字符，去hash表中查找，并进行处理
 */
public class day43_电话号码 {
    public static void TelNumber(String[] str ,int n) {
        ArrayList<String> list=new ArrayList<>();
       String symbol="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
       String number="222333444555666777788899991234567890";
       for(int i=0;i<n;i++){
           str[i]=str[i].replace("-","");
           String result="";
           for(int j=0;j<7;j++){
               result=result+number.charAt(symbol.indexOf(str[i].charAt(j)+""));
           }
           result=result.substring(0,3)+"-"+result.substring(3,7);
           if(!list.contains(result)){
               list.add(result);
           }
       }
        Collections.sort(list);
        for(int j=0;j<list.size();j++){
            System.out.println(list.get(j));
        }
        System.out.println();
     }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            scanner.nextLine();
            String[] str=new String[n];
            for(int i=0;i<n;i++){
                str[i]=scanner.nextLine();
            }
            TelNumber(str,n);
        }
    }
}


/*
12
4873279
ITS-EASY
888-4567
3-10-10-10
888-GLOP
TUT-GLOP
967-11-11
310-GINO
F101010
888-1200
-4-8-7-3-2-7-9-
487-3279
4
UTT-HELP
TUT-GLOP
310-GINO
000-1213

输出
310-1010
310-4466
487-3279
888-1200
888-4567
967-1111

000-1213
310-4466
888-4357
888-4567
 */