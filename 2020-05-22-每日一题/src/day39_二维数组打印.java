import org.omg.PortableInterceptor.INACTIVE;

public class day39_二维数组打印 {
    public static int[] arrayPrint(int[][] arr, int n) {
        int[] arr2 = new int[n * n];
        int index = 0;
        int initX = 0;
        int initY = n-1;
        while (initX < n) {
            int x = initX;
            int y = initY;
            while (x < n && y < n) {
                arr2[index] = arr[x][y];
                index++;
                x++;
                y++;
            }
            if (initY > 0) {
                initY--;
            } else {
                initX++;
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        int n=4;
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[] aw=arrayPrint(arr,n);
        for(int e: aw){
            System.out.print(e+" ");
        }
    }
}
