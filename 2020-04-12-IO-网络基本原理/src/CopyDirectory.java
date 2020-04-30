import java.io.File;
import java.io.IOException;
//目录复制
public class CopyDirectory {
    private static String srcAbsPath;
    private static String desAbsPath;

    public static void main(String[] args) throws IOException {
        /*
        if (args.length < 2) {
            System.out.println("请按照以下格式使用程序：");
            System.out.println("CopyDirectory 源目录 目标目录");
            return;
        }
        */

        String srcPath = "D:\\2_java14class\\java14_code_me\\4——java_web\\2020-04-12-IO-网络基本原理";
        String destPath = "D:\\2_java14class\\java14_code_me\\4——java_web\\目标\\目标目录";
        //String srcPath = args[0];
        //String destPath = args[1];
        File srcFile = new File(srcPath);
        File destFile = new File(destPath);

        srcAbsPath = srcFile.getAbsolutePath();
        desAbsPath = destFile.getAbsolutePath();

        // TODO: 检查源文件是否存在，是否是目录
        // TODO: 检查目标文件是否不存在
        // TODO: 检查目标文件的上一级目录是否存在

        copyDirectory(srcPath, destPath);
    }

    /**
     * 遍历所有的目录结构
     * 如果是目录，我也随着创建目录
     * 如果是文件，调用复制文件的方式进行复制
     * @param srcPath   源目录路径
     * @param destPath  目标目录路径
     * @throws IOException
     */
    private static void copyDirectory(String srcPath, String destPath) throws IOException {
        File srcRoot = new File(srcPath);
        travelDirectory(srcRoot);
    }

    private static void doDirectory(File directory) {
        // 为了找出要复制的目录的相对路径（相对于源路径 —— 根）
        String srcPath = directory.getAbsolutePath();
        String relativePath = srcPath.substring(srcAbsPath.length());
        String destPath = desAbsPath + relativePath;

        File destDirectory = new File(destPath);
        destDirectory.mkdir();
        System.out.println(destPath + " 目录创建成功");
    }

    private static void doFile(File file) {
    }

    private static void doNode(File node) {
        if (node.isDirectory()) {
            doDirectory(node);
        } else {
            doFile(node);
        }
    }

    private static void travelDirectory(File root) {
        doNode(root);   // 被遍历的每个结点，都需要被调用

        if (root.isDirectory()) {
            File[] files = root.listFiles();
            if (files != null) {
                for (File file : files) {
                    travelDirectory(file);
                }
            }
        }
    }
}
