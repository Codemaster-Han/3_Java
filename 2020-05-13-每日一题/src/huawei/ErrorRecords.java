package huawei;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*
首先来总结一下题目的意思和需要注意的点：

（1）只要文件名和行号相同，就合并为一条错误，将这条错误记录的错误数加1；

（2）结果按记录的错误数由大到小排序输出，这个排序必须具有稳定性，先输入的记录排在前面；

（3）记录最多8条错误记录其实是将排序结果只输出前8条；

（4）当文件名长度（包括后缀如.c）大于16时，只需要在输出时将文件名缩小到后16位，记录错误时按原文件名，这样就不会因为缩减后的名字相同而合并。

创建两个ArrayList集合names,sum，names用来存文件名和行号，sum用来存这条记录的错误数，存储完毕之后，将两个集合转为数组并排序，最后输出前8条记录，并在输出过程中校验文件名。
————————————————
版权声明：本文为CSDN博主「木阿南二三记」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/qq_43109561/article/details/95069111
 */
public class ErrorRecords {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> map=new LinkedHashMap<String,Integer>();
        String path;
        String fileName;
        int lineNum;
        String key;
        while(sc.hasNext())
        {
            path=sc.next();
            int id=path.lastIndexOf('\\');
            fileName=id<0?path:path.substring(id+1);
            lineNum=sc.nextInt();
            key=fileName+" "+lineNum;
            if(map.containsKey(key))
                map.put(key, map.get(key)+1);
            else
                map.put(key, 1);
        }
        sc.close();

        //记录错误信息
        List<Map.Entry<String,Integer>> lists=new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
        Collections.sort(lists,new Comparator<Map.Entry<String,Integer>>()
        {
            public int compare(Entry<String, Integer> arg1,Entry<String, Integer> arg2)
            {
                return (arg2.getValue()-arg1.getValue())==0?(arg1.getValue()-arg2.getValue()):(arg2.getValue()-arg1.getValue());
            }
        });

        int count=0;
        for(Map.Entry<String, Integer> list:lists)
        {
            if(count<8)
            {
                String[] str=list.getKey().split(" ");
                String k=str[0].length()>16?str[0].substring(str[0].length()-16):str[0];
                String n=str[1];
                System.out.println(k+" "+n+" "+list.getValue());
            }
            else
                break;
            count++;
        }
    }
}

/*
E:\V1R2\product\fpgadriv1.c 1325
F:\V1R2\product\fpgadriv1.c 1325
G:\V1R2\product\fpgadriv1.c 1325
E:\V1R2\product\fpgadriv1.c 1327
E:\V1R2\product\fpgadriv5.c 1325
E:\V1R2\product\fpgadriv7.c 1325
E:\V1R2\product\fpgadriv7.c 1324
E:\V1R2\product\fpgadriv6.c 1325
E:\V1R2\product\fpgadriv9.c 1325

aa1.txt 2 14 aa3.txt 1 13 aa1.txt 1 12 aa2.txt 1 12 aa3.txt 3 11 aa3.txt 2 11 aa2.txt 3 10 aa1.txt 3 9
你的输出为:
aa1.txt 2 14 aa3.txt 1 13 aa1.txt 1 12 aa2.txt 1 12 aa3.txt 3 11 aa3.txt 2 11 aa2.txt 3 10 aa1.txt 3 9
 */