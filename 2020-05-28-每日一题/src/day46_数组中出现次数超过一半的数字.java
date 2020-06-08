public class day46_数组中出现次数超过一半的数字 {

    public int MoreThanHalfNum_Solution(int [] array) {
         int n=array.length/2;
         int[] arr=new int[array.length];
         for(int i=0;i<array.length;i++){
             arr[i]=0;
             for(int j=0;j<array.length;j++){
                 if(array[i]==array[j]){
                     arr[i]++;
                 }
             }
         }
         for(int k=0;k<arr.length;k++){
             if(arr[k]>n){
                 return  array[k];
             }
         }
         return 0;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,2,2,2,5,4,2};
        day46_数组中出现次数超过一半的数字 aa=new day46_数组中出现次数超过一半的数字();
        System.out.println(aa.MoreThanHalfNum_Solution(array));
    }
}
