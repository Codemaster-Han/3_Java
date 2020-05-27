package standard;

import java.io.IOException;

//抽象类
public abstract class HttpServlet implements  Servlet {
    @Override
    public  void process(HttpServletResponse req,HttpServletResponse resp)throws IOException {

    }

    public void doGet(HttpServletResponse req,HttpServletResponse resp)throws IOException{

    }

    public void doPost(HttpServletResponse req,HttpServletResponse resp)throws IOException{

    }
}
