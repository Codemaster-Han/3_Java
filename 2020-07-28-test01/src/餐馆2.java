//思想，优先级队列

import java.util.*;
public class 餐馆2 {
        public static void main(String[] args) {
            Scanner  sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            sc.nextLine();
            String[] s1=sc.nextLine().split(" ");
            int[] table= new int[n];
            for(int i=0;i<n;i++){
                table[i]=Integer.parseInt(s1[i]);
            }
            Arrays.sort(table);

            PriorityQueue<Customer> pq=new PriorityQueue<Customer>();
            for(int i=0;i<m;i++){
                int person=sc.nextInt();
                int money=sc.nextInt();
                if(person<=table[n-1]){  //最大容量的桌子可以坐下时，将客户加入队列
                    pq.offer(new Customer(person, money));
                }
            }
            long sum=0; //用int会出错
            int count=0;
            int[] visited = new int[n]; //和table[]一一对应,默认全是0
            for(int i=0;!pq.isEmpty();i++){
                //顶多把队列中的安排完
                //由于列队中的都有资格吃，且排在前边的最有资格，应该安排；
                //安排的时候注意先从小桌子安排，不行再换大桌子
                Customer c=pq.poll();
                for(int j=0;j<n;j++){ //遍历桌子
                    if(table[j] >= c.person && visited[j]==0 ){ //可以坐下
                        sum+=c.money;
                        visited[j]=1;//j号桌已有客人
                        count++;
                        break;
                    }
                }
                if(count==n){
                    break;
                }
            }
            System.out.println(sum);
        }
        static class Customer implements Comparable<Customer>{
            int person;
            int money;
            public Customer(){}
            public Customer(int person,int money){
                this.person=person;
                this.money=money;
            }
            @Override
            public int compareTo(Customer o) { //按钱大小排序
                if(this.money < o.money){
                    return 1;
                }else if(this.money > o.money){
                    return -1;
                }
                return 0;
            }

        }
}
