import java.util.ArrayList;
import java.util.List;

public class TriangleDemo {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    //杨辉三角 普通方法
    //每一行 triangle[i][0], triangle[i][i]:  1
    //中间元素： triangle[i][j] = triangle[i- 1][j - 1] + triangle[i - 1][j]
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle=new ArrayList<>(numRows);//建立一个有numRows行的二维数组空间

        //数组初始化
        //遍历整个数组，使得每一行的第一个元素尾插为1
        for(int i=0;i<numRows;i++) {
            triangle.add(new ArrayList<>());
            triangle.get(i).add(1);
        }

        //从第二行开始遍历每一行
        for(int i=1;i<numRows;i++){
            //从第二行第二列开始遍历每个元素
            for(int j=1;j<i;j++){
                int ret = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                triangle.get(i).add(ret);
            }
            triangle.get(i).add(1);//给每一行的最后一个位置尾插一个1
        }
        return  triangle;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
