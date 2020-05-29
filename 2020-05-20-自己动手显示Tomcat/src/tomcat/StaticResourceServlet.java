package tomcat;

import standard.HttpServlet;
import standard.HttpServletRequest;
import standard.HttpServletResponse;

import java.io.*;

public class StaticResourceServlet extends HttpServlet {
    private static final String TOMCAT_HOME = "D:\\2_java14class\\2——java14_code_me\\4——java_web\\2020-05-20-自己动手显示Tomcat";

    private String getFilePath(String path) {
        return TOMCAT_HOME + File.separator + "web" + File.separator + path;
    }

    // /gogogo.html
    public boolean isStaticResource(String path) {
        String filePath = getFilePath(path);    // ...\web\gogogo.html
        File file = new File(filePath);
        if (!file.exists()) {
            return false;
        }

        return file.isFile();
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // 读取静态资源对应的文件
        // 把内容写入到 response 中

        resp.setContentType("text/html; charset=utf-8");

        String filePath = getFilePath(req.getPath());
        try (InputStream fileInputStream = new FileInputStream(filePath)) {
            OutputStream respOutputStream = resp.getOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                respOutputStream.write(buffer, 0, len);
            }
            respOutputStream.flush();
        }
    }
}
