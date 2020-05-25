package 每日一题;

public class day35_风口的猪_中国牛市 {
    /**
     * 计算你能获得的最大收益
     *
     * @param prices Prices[i]即第i天的股价
     * @return 整型
     */
    public static int calculateMax(int[] prices) {
        int max=0;
        int w=2;//两次入股的机会
        for(int i=0;i<prices.length-1;i++){
            int k=prices[i+1]-prices[i];
            if(k>0){
                max+=k;
            }else {
                if(w>0){
                    w--;
                }else {
                    break;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices={3,8,5,1,7,8};
        System.out.println(calculateMax(prices));
    }
}
