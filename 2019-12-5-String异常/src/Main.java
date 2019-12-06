import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Condition {
    boolean judge(String s1, String s2);
}

class EqualsCondition implements Condition {
    @Override
    public boolean judge(String s1, String s2) {
        return s1.equals(s2);
    }
}

public class Main {
    public static List<String> find(List<String> origin, String s, Condition condition) {
        List<String> result = new ArrayList<>();
        for (String s1 : origin) {
            if (condition.judge(s, s1)) {
                result.add(s1);
            }
        }

        return result;
    }

    public static List<String> findEquals(List<String> origin, String s) {
        return find(origin, s, new EqualsCondition());
    }

    public static List<String> findLessThan(List<String> origin, String s) {
        Condition condition = new Condition() {
            @Override
            public boolean judge(String s1, String s2) {
                return s1.compareTo(s2) < 0;
            }
        };
        return find(origin, s, condition);
    }

    public static List<String> findEqualsIgnoreCase(List<String> origin, String s) {
        return find(origin, s, (s1, s2) -> s1.equalsIgnoreCase(s2));
    }

    public static List<String> findEndsWith(List<String> origin, String s) {
        List<String> result = new ArrayList<>();
        for (String s1 : origin) {
            if (s1.endsWith(s)) {
                result.add(s1);
            }
        }

        return result;
    }

    public static List<String> findContains(List<String> origin, String s) {
        List<String> result = new ArrayList<>();
        for (String s1 : origin) {
            if (s1.contains(s)) {
                result.add(s1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        /*
        String command = "javac -encoding UTF-8 Main.java";
        String[] brgs = command.split(" ");
        System.out.println(Arrays.toString(brgs));
         */
        /*
        String domain = "www.baidu.com";
        String[] subdomain = domain.split("\\.");
        System.out.println(Arrays.toString(subdomain));
         */

        String[] subdomain = { "www", "baidu", "com" };
        String s = String.join(".", subdomain);//按照点进行拼接
        System.out.println(s);

        String s1 = "hello";
        String s3 = s1.concat("s2");
        // s3 = s1 + "s2";
    }
}








