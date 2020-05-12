package com.peixinchen;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/redirect")   //等同于配置web.xml
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //301状态码 ，表示 永久重定义向
        //resp.setStatus(302);//  重定义项到  GET 上
        //resp.setStatus(303);//  重定义项到  GET 上
        resp.setStatus(307);//  重定义项到  POST 上
        resp.setHeader("Location", "/success");
    }
}
