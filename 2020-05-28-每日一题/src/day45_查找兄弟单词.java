import java.util.*;
import java.io.*;

public class day45_查找兄弟单词 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int wordsNum = scanner.nextInt();
            String[] dict = new String[wordsNum];
            for (int i = 0; i < wordsNum; i++) {
                dict[i] = scanner.next();
            }
            String target = scanner.next();
            int brotherIndex = scanner.nextInt();
            process(dict, target, brotherIndex);
            scanner.nextLine();
        }
    }

    public static void process(String[] dict, String target, int brotherIndex) {
        ArrayList<String> list = new ArrayList<>();
        Arrays.sort(dict);
        for (String cur : dict) {
            if (isBrother(target, cur)) {
                list.add(cur);
            }
        }
        System.out.println(list.size());
        if (brotherIndex <= list.size() && list.size() > 0) {
            System.out.println(list.get(brotherIndex - 1));
        }
    }

    public static boolean isBrother(String target, String cur) {
        // target can not same as cur
        if (target.equals(cur)) {
            return false;
        }
        // length must be same
        if (target.length() != cur.length()) {
            return false;
        }
        // norm case
        char[] targetArray = target.toCharArray();
        char[] curArray = cur.toCharArray();
        // sortted array must be same
        Arrays.sort(targetArray);
        Arrays.sort(curArray);
        for (int i = 0; i < curArray.length; i++) {
            if (targetArray[i] != curArray[i]) {
                return false;
            }
        }
        return true;
    }
}

/**

 输入描述:
 先输入字典中单词的个数n，再输入n个单词作为字典单词。
 再输入一个单词，查找其在字典中兄弟单词的个数m
 再输入数字k

 输出描述:
 根据输入，输出查找到的兄弟单词的个数m
 然后输出查找到的兄弟单词的第k个单词。
 */

/*
输入
3 abc bca cab abc 1
输出
2
bca
 */