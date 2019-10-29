package cn.zb.interceptor;

import cn.zb.entity.Users;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        Users user = (Users) request.getSession().getAttribute("user");
        System.out.println("11111111111111111");
        if(user != null){
            return true;
        }else {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            out.print("你还没有登录，请登录");
            return false;
        }

    }
}
