package 接口连同抽象类;

import java.util.Arrays;

//抽象类  abstract
   abstract  class  AbstactList implements MyList{
        protected int size;

        @Override
        public  void pushBack(int element){
            insert(size,element);//尾插
        }
        @Override
        public  void pushFront(int element){
            insert(0,element);//头插
        }

        }

    //普通类  继承  抽象类   (写公用的方法）
    class MyArray extends  AbstactList{
        @Override
        public  void insert(int index ,int element){
            int[] arr=new int[size];
            for(int i=index;i<size;i++){
                arr[i+1]=arr[i];
            }
            arr[index]=element;
            size++;
        }
    }

    public  class 接口连同抽象类{
        public static void main(String[] args) {
            MyArray arr=new MyArray();
            arr.pushBack(1);
            arr.pushFront(2);
            arr.pushBack(3);//2 1 3
            arr.insert(1,4);//2 4 1 3
            //System.out.println(Arrays.toString(arr));

        }
    }