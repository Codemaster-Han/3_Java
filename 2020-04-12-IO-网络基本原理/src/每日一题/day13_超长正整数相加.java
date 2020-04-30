package 每日一题;

public class day13_超长正整数相加 {
        public static String AddLongInterge(String addend,String augend){
            String sum;
            int len;
            if(addend.length()>augend.length()){
                len=addend.length();
            }else {
                len=augend.length();
            }
            char[] a=addend.toCharArray();
            char[] b=augend.toCharArray();
            int j=0;
            for(int i=len-1;i>=0;i--){
                while (j<augend.length()){
                    if(a[i]+b[j]>9){
                        a[i]=0;
                        //b[j]=a[i]+b[j]-10;
                        a[i-1]=b[j];
                    }
                    j++;
                }
            }
            sum=a.toString();
            return sum;
        }

        public static void main(String[] args) {
            String add1="999";
            String add2="1";
            System.out.println(AddLongInterge(add1, add2));
            System.out.println("计算完了");
        }

    }
