package 每日一题;

import java.util.Scanner;

public class day37_地下迷宫 {
    public static void jump(int n,int m,int p,int[][] arrNM,int ww){
        int k=-p;
        if (k>=0){
            System.out.println(" ");
        }else {
            //体力用完了，没有跳出迷宫
            System.out.println("Can not escape");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//n行
        int m=scanner.nextInt();//m列
        int p=scanner.nextInt();//体力值
        int[][] arrNM=new int[n][m];//4 4 10 1 0 0 1 1 1 0 1 0 1 1 1 0 0 1 1
        int ww=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arrNM[i][j]=scanner.nextInt();
                if(arrNM[i][j]==1){
                    ww+=1;//可以跳的1的个数
                }
            }
        }
        jump(n,m,p,arrNM,ww);
        /*
         n行m列的一个二维数组
        for(int[] a:arrNM){
            for(int e:a){
                System.out.print(e);
                System.out.print(" ");
            }
            System.out.println();
        }

        //0代表有障碍物，1代表可以到达的位置
        1 0 0 1
        1 1 0 1
        0 1 1 1
        0 0 1 1
        */

    }
}
//==========================================================================================
/**
 链接：https://www.nowcoder.com/questionTerminal/571cfbe764824f03b5c0bfd2eb0a8ddf
 来源：牛客网

 * 小青蛙有一天不小心落入了一个地下迷宫,
 * 小青蛙希望用自己仅剩的体力值P跳出这个地下迷宫。
 * 为了让问题简单,假设这是一个n*m的格子迷宫,
 * 迷宫每个位置为0或者1,0代表这个位置有障碍物,
 * 小青蛙达到不了这个位置;1代表小青蛙可以达到的位置。
 * 小青蛙初始在(0,0)位置,地下迷宫的出口在(0,m-1)(保证这两个位置都是1,并且保证一定有起点到终点可达的路径),
 * 小青蛙在迷宫中水平移动一个单位距离需要消耗1点体力值,
 * 向上爬一个单位距离需要消耗3个单位的体力值,
 * 向下移动不消耗体力值,当小青蛙的体力值等于0的时候还没有到达出口,
 * 小青蛙将无法逃离迷宫。现在需要你帮助小青蛙计算出能否用仅剩的体力值跳出迷宫(即达到(0,m-1)位置)。

 import java.util.Iterator;
 import java.util.LinkedList;
 import java.util.Scanner;

public class 地下迷宫 {

    static int n, m, maxRemainEnergy = 0;
    static int[][] map;
    static boolean flag = false;
    static String path = "";
    static LinkedList<String> linkedlist = new LinkedList<>();

    public static void main(String[] args) {

        //输入
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int P = sc.nextInt();
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        //处理
        runMap(0, 0, P);

        //输出
        if (!flag)
            System.out.println("Can not escape!");
        else
            System.out.println(path);

    }

    public static synchronized void runMap(int x, int y, int energy) {
        if (energy < 0 || x<0 || y<0 || x>=n || y>= m || map[x][y] != 1) return;
        else {
            linkedlist.offer("[" + x + "," + y + "]");
            map[x][y] = 0;
            if (x == 0 && y == m - 1) {
                if (energy >= maxRemainEnergy) {
                    maxRemainEnergy = energy;
                    updatePath();
                }
                map[x][y] = 1; linkedlist.removeLast();
                flag = true; return;
            }
            runMap(x, y+1, energy-1);
            runMap(x+1, y, energy);
            runMap(x-1, y, energy-3);
            runMap(x, y-1, energy-1);
            map[x][y] = 1;linkedlist.removeLast();
        }
    }

    public static void updatePath() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> iterator = linkedlist.iterator();
        while (iterator.hasNext())
            sb.append(iterator.next() + ",");
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);
        path = sb.toString();
    }

}
 */
//==========================================================================================
/**
链接：https://www.nowcoder.com/questionTerminal/571cfbe764824f03b5c0bfd2eb0a8ddf
        来源：牛客网

 //完全递归了所有路径，如果当前体力已经不足，则提前跳出当前路径。
 import java.util.Iterator;
 import java.util.LinkedList;
 import java.util.Scanner;

public class Main {
    private static int m = 0, n = 0, minCost = Integer.MAX_VALUE, p = 0;
    private static LinkedList<Point> linkedList = new LinkedList<>();
    private static String path = "";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        p = in.nextInt();
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = in.nextInt();
            }
        }
        generate(map, 0, 0, 0);
        if (minCost == Integer.MAX_VALUE) {
            System.out.println("Can not escape!");
        } else {
            System.out.println(path.substring(0,path.length()-1));
        }
    }

    private static void generate(int[][] map, int x, int y, int currentCost) {
        if (currentCost > p) return;
        map[x][y] = 2;
        linkedList.offer(new Point(x, y));
        if (x == 0 && y == m - 1) {
            if (currentCost < minCost){
                minCost = currentCost;
                savePath();
            }
            map[x][y] = 1;
            linkedList.removeLast();
            return;
        }
        if (x < n - 1 && map[x + 1][y] == 1) {//down
            generate(map, x + 1, y, currentCost);
        }
        if (x > 0 && map[x - 1][y] == 1) {//up
            generate(map, x - 1, y, currentCost + 3);
        }
        if (y < m - 1 && map[x][y + 1] == 1) {//right
            generate(map, x, y + 1, currentCost + 1);
        }
        if (y > 0 && map[x][y - 1] == 1) {//left
            generate(map, x, y - 1, currentCost + 1);
        }
        map[x][y] = 1;
        linkedList.removeLast();
    }

    private static void savePath() {
        Iterator<Point> iterator = linkedList.iterator();
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            Point point = iterator.next();
            sb.append("[").append(point.x).append(",").append(point.y).append("],");
        }
        path = sb.toString();
    }

    private static class Point {
        int x = 0;
        int y = 0;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
*/


//==========================================================================================

/**
 * 回溯思想+贪心算法
 链接：https://www.nowcoder.com/questionTerminal/571cfbe764824f03b5c0bfd2eb0a8ddf
 来源：牛客网

 * 1 0 0 1
 * 1 1 0 1
 * 0 1 1 1
 * 0 0 1 1
 *
 * [0,0],[1,0],[1,1],[2,1],[2,2],[2,3],[1,3],[0,3]

 import java.util.ArrayList;
 import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                arr[i][j] = sc.nextInt();

        //x、y设为起点
        int x=0,y=0;
        //用两个list，放走过的坐标
        ArrayList<Integer> xlist = new ArrayList<>();
        ArrayList<Integer> ylist = new ArrayList<>();

        int i=0;
        if(fun(x,y,n,m,p,xlist,ylist,arr)) {
            while(true) {
                if(i<xlist.size())
                    System.out.print("["+xlist.get(i)+","+ylist.get(i)+"]");
                else
                    break;
                i++;
                if(i<xlist.size())
                    System.out.print(",");
            }
        }else
            System.out.println("Can not escape!");
    }

    private static boolean fun(int x, int y, int n, int m, int p, ArrayList<Integer> xlist, ArrayList<Integer> ylist,
                               int[][] arr) {
        if(x<0||x>=n||y<0||y>=m||arr[x][y]!=1||p<0)
            return false;

        //走过的坐标，赋为-1
        arr[x][y] = -1;
        xlist.add(x);
        ylist.add(y);

        if(x==0&&y==m-1)
            return true;

        //贪心策略
        if(!fun(x-1,y,n,m,p,xlist,ylist,arr))
            if(!fun(x,y+1,n,m,p-1,xlist,ylist,arr))
                if(!fun(x+1,y,n,m,p-3,xlist,ylist,arr))
                    if(!fun(x,y-1,n,m,p-1,xlist,ylist,arr)) {
                        //回溯回退，对应坐标赋为0，并且从list中移除
                        arr[x][y] = 0;
                        xlist.remove(xlist.size()-1);
                        ylist.remove(ylist.size()-1);
                        return false;
                    }
                    else {
                        return true;
                    }
                else {
                    return true;
                }
            else {
                return true;
            }
        else
            return true;

    }

}
 */