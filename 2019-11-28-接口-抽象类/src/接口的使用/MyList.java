package 接口的使用;

    //定义接口--合同   关键字interface（接口）
    public interface MyList {
        void pushFront(int element);//头插
        void popFront();//头删

        int get(int index);
        void set(int index, int element);
    }

