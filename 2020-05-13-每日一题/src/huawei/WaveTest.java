package huawei;
//小强师兄三角波算法
public class WaveTest {
    public static void main(String[] args) {
        int samNmb=11,i,cnt=1,adCount=10000,daCount=10000,daMax=4000;
        int deltaX=daCount/(samNmb-1);
        int daltaY=daMax/((samNmb-1)/2);
        int[] x_Dafault={0,0,0,0,0,0,0,0,0,0,0};
        int[] x_Bakup={0,0,0,0,0,0,0,0,0,0,0};
        int[] y={0,0,0,0,0,0,0,0,0,0,0};
        int[] x={0,0,0,0,0,0,0,0,0,0,0};
        for(i=0;i<samNmb;i++){
            x[i]=i*deltaX;
            if(i<(samNmb-1)/2+1){
                y[i]=i*daltaY;
            }else {
                y[i]=y[(samNmb-1)/2]-daltaY*cnt;
                cnt++;
            }
        }

        x[samNmb-1]=daCount-1;
        y[samNmb/2]=daMax;

        for(i=0;i<samNmb;i++){
            x_Dafault[i]=x[i];
            x_Bakup[i]=x[i];
        }

        System.out.println("x_Dafault数组里的值");
        for(int e:x_Dafault){
            System.out.print(e+" ");
        }

        System.out.println(" ");
        System.out.println("x_Bakup数组里的值");
        for(int e:x_Bakup){
            System.out.print(e+" ");
        }
        System.out.println("");
        System.out.println("y数组里的值");
        for(int e:y){
            System.out.print(e+" ");
        }
    }
}


/**
 * 运行结果--------符合三角波
 * x_Dafault数组里的值
 * 0 1000 2000 3000 4000 5000 6000 7000 8000 9000 9999
 * x_Bakup数组里的值
 * 0 1000 2000 3000 4000 5000 6000 7000 8000 9000 9999
 * y数组里的值
 * 0 800 1600 2400 3200 4000 3200 2400 1600 800 0
 */