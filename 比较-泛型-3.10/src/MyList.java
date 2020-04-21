public class MyList<E>{
    public  E[] array;
    public  int size;

    public  MyList(){
       array=(E[])new Object[16];
        size=0;
    }

    //尾插
    public void add(E element){
        array[size++]=element;
    }
    //尾删
    public  E remove(){
        E element=array[size-1];
        array[size-1]=null;
        size--;
        return  element;
    }
    //打印
    public void print1(){
        for(E e:array){
            System.out.print(e+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyList<Integer> my=new MyList<>();
        my.add(1);
        my.add(2);
        my.add(3);
        my.add(4);
        my.print1();
    }

}
