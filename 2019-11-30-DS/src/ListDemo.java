import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(4);
        list1.add(0,2);
        list1.add(1,3);
        System.out.println("=============");
        for(Integer a:list1){
            System.out.println(a);//2 3 4
        }

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(list1);
        list2.remove(0);
        Object b=3;
        list2.remove(b);
        System.out.println("=============");
        for(Integer a:list2){
            System.out.println(a);//4
        }

        ArrayList<Integer> list3=new ArrayList<>(list1);//拷贝数组
        System.out.println("=============");
        for(Integer a:list3){
            System.out.println(a);//2 3 4
        }

        list1.get(1);
        list1.set(0,6);
        System.out.println("=============");
        System.out.println(list1.contains(6));//true
        System.out.println(list1.indexOf(3));//1
        System.out.println(list1.lastIndexOf(3));//1
        for(Integer a:list1){
            System.out.println(a);//6 3 4
        }

        System.out.println("=============");
        for(Integer a:list1.subList(0,2)){  //截取的是左闭右开的区间 【0，2）
            System.out.println(a);//6 3
        }


    }
}


//equals  和  toString 方法一般需要重写