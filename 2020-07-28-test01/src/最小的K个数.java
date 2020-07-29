import java.util.ArrayList;
import java.util.Arrays;

public class 最小的K个数 {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        Arrays.sort(input);
        for(int i=0;i<k;i++){
            arr.add(input[i]);
        }
        System.out.println(arr);
        return arr;
    }

    public static void main(String[] args) {
        int k=4;
        int[] input={4,5,1,6,2,7,3,8};
        GetLeastNumbers_Solution(input,k);
    }
}
