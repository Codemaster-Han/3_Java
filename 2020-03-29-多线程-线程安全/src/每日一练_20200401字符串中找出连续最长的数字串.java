/*算法思想：用max表示经过的数字长度最大值，count表示数字计数器，当为字母时重置为0
 *end表示数字尾部，每次满足数字时，对max进行判断，当max小于于count时，更新max和end
 */
import java.util.Scanner;
public class 每日一练_20200401字符串中找出连续最长的数字串 {
    public static String searchLongString(String st) {
        int max=0;
        int cnt=0;
        int end=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)>='0'&&st.charAt(i)<='9'){
                cnt++;
                if(cnt>max){
                    max=cnt;
                    end=i;
                }
            }else  {
                cnt=0;
            }
        }
        return st.substring(end-max+1,end+1);
    }


    public static void main(String[] args) {
        Scanner scanner=new  Scanner(System.in);
        String st = scanner.nextLine();
        System.out.println(searchLongString(st));
    }
}
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int max = 0,count = 0, end = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    count++;
                    if (max < count) {
                        max = count;
                        end = i;
                    }
                } else {
                    count = 0;
                }
            }
            System.out.println(str.substring(end - max + 1, end + 1));//截取字符串的一部分
        }
    }
    */

