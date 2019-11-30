import java.util.HashMap;
import java.util.Map;//映射-----K-V

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("编剧","于正");
        map.put("剧本","紫禁城里的小时光");
        map.put("拍摄时间","2019年");
        for(Map.Entry<String,String> entry :map.entrySet()){
            System.out.println(entry.getKey()+"----->"+entry.getValue());
        }

        map.put("拍摄时间","2018");//修改
        map.put("主演","周路啦");//插入
        for(Map.Entry<String,String> entry :map.entrySet()){
            System.out.println(entry.getKey()+"----->"+entry.getValue());
        }

        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("编剧"));
        System.out.println(map.containsValue("2018"));
    }
}
