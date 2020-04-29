import java.io.File;
import java.io.IOException;

public class 相对路径和绝对路径 {
    public static void test1 () throws IOException{
        File file1=new File("111");
        //创建文件
        file1.createNewFile();//true 或者 false
        //创建文件夹
        file1.mkdir();
        file1.mkdirs();
        //删除文件(不是删除到回收站，是彻底删除）
        file1.delete();
        file1.deleteOnExit();
        //重命名文件
        File dest=new File("222");
        file1.renameTo(dest);
        //列出所有文件夹
        File file2=new File("D\\USER");
        File[] result=( file2).listFiles();
    }
    public static void main(String[] args)throws IOException {
        File file=new File("一个相对路径的文件");
        System.out.println(file.getAbsoluteFile());
        test1();
    }
}
