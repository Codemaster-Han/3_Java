package 关系总结;

public class main {
    public static void main(String[] args) {
        caiXuKun p=new caiXuKun();
        Rapper R=p;
        明星 m=p;
        ((caiXuKun) m).hipHop();
    }
}
