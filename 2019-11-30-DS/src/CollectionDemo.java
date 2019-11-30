import java.util.ArrayList;
import java.util.Collection;//容器----增删查改

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        System.out.println( list.size());
        System.out.println( list.isEmpty());

        list.add("hello");
        list.add("你好");
        for(String s:list){
            System.out.println(s);
        }
        System.out.println( list.size());
        System.out.println(list.isEmpty());

        list.remove("你好");
        System.out.println( list.size());
        System.out.println( list.isEmpty());
        list.clear();

    }
}
