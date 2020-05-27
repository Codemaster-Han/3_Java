package standard;

import java.io.IOException;

public interface Servlet {
    //Servlet对象实例化之后，会调用
    void init();
    //每次处理请求时使用
    void process(ServletRequest req,ServletResponse resp)throws IOException;
    //SerVlet对象被销毁之前使用
    void destory();
}
