import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class day47_马戏团 {
    static class Person{
        int weight;
        int height;
        public Person(int weight,int height){
            this.weight=weight;
            this.height=height;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            Person[] arr=new Person[n];
            for(int i=0;i<n;i++){
                int index=scanner.nextInt();
               arr[index-1]=new Person(scanner.nextInt(),scanner.nextInt());
            }
            Arrays.sort(arr, new Comparator<Person>() {
                @Override
                public int compare(Person p1, Person p2) {
                    int res1=Integer.compare(p1.height,p2.height);
                    if(res1!=0){
                        return res1;
                    }else {
                        return Integer.compare(p1.weight,p2.weight);
                    }
                }
            });

            int[] F=new int[n];
            F[0]=1;
            int max=0;
            for(int i=0;i<n;i++){
                F[i]=1;
                for(int j=i-1;j>=0;j--){
                    if(arr[i].weight>arr[j].weight){
                        F[i]=Math.max(F[i],F[j]+1);
                    }
                }
                max=Math.max(max,F[1]);
            }
            System.out.println(max);
        }
    }

}

/*
6
1 65 100
2 75 80
3 80 100
4 60 95
5 82 101
6 81 70
 */