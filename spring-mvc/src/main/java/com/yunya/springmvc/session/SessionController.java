package com.yunya.springmvc.session;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * 设置session、获取session
 * session 存储路径：默认是服务器端的缓存中，所以重启了服务之后，你访问不到之前设置好的session。
 * session 有效时间：默认是30分钟。
 *
 * Session 的生命周期管理：
 * 创建 Session： 当客户端第一次访问服务器时，服务器会为该客户端创建一个新的 Session，并分配一个唯一的 Session ID。
 * Session ID 的传递： 通常，Session ID 会通过 Cookie 或者 URL 重写（URL 重写在禁用 Cookie 时使用）的方式传递给客户端，客户端在后续请求中会自动发送该 Session ID。
 * Session 的超时和失效： Session 可能会因为超时（例如，30分钟没有活动）或者显示失效（例如，用户注销或关闭浏览器）而被销毁。
 */
@RestController
public class SessionController {

    /**
     * 在 Spring MVC 中，可以直接注入 HttpSession 对象，并使用其方法来操作 Session。
     */
    @RequestMapping("/setSession")
    public String setSession(HttpSession session) {
        session.setAttribute("name", "yunyaSession");
        return "set session value -- name success";
    }

    /**
     * 获取 Session
     */
    @RequestMapping("/getSession")
    public String getSession(HttpSession session) {
        String name = (String) session.getAttribute("name");
        return "session value -- name: " + name;
    }

}
