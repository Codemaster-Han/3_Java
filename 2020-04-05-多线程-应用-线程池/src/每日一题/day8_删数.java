package 每日一题;

import java.util.*;

//每隔两个数删除一个数，循环进行，求最后一个删除的数的下标
//测试用例   n=8      输出6
//数【0 1 2 3 4 5 6 7】  解释：  0 1   2（删）  3 4  5（删）  6 7  0（删）-----

//循环队列
public class day8_删数 {
        public  static  int deleteNumber(List<Integer> list){
            int i=0;
             while (list.size()>1){
                 i=(i+2)%list.size();
                 list.remove(i);
             }
             return  list.get(0);
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()){
                int n=sc.nextInt();
                if(n>1000){
                    n=999;
                }
                //Queue<Integer> que=new LinkedList<Integer>();
                List<Integer> list=new ArrayList<Integer>();
                for(int i=0;i<n;i++){
                    list.add(i);
                }
                System.out.println(deleteNumber(list));
            }
        }

    }
