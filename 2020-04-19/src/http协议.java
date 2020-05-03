public class http协议 {
    public  static void  parseUrl(String  url){
        char[] arr=url.toCharArray();
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==':'){
                for(int j=0;j<i;j++){
                    System.out.print(arr[j]);
                }
            }
            if(arr[i]=='/'){
                cnt++;
                if(cnt>2&&cnt%2==1){
                }
            }
        }
    }

    public static void main(String[] args) {
        String url="http://www.baidu.com/";
        String url2="http://www.bitiedu.vip/thread-809.htm";
        System.out.println("============");
        parseUrl(url);
        System.out.println("============");
        parseUrl(url2);
    }
}
