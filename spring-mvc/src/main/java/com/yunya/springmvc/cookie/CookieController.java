package com.yunya.springmvc.cookie;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * 当服务器返回响应时，可以通过设置 Set-Cookie 头来指定要在客户端设置的 Cookie。
 *
 * 在浏览器中，客户端发送 Cookie 是由浏览器自动处理的，通常是在服务器发送响应时，
 * 服务器会在响应头中包含 Set-Cookie 字段，告诉浏览器要设置的 Cookie 信息。
 * 然后浏览器会在之后的每个请求中自动包含相应的 Cookie。
 *
 * @CookieValue 注解 用于获取请求中的 Cookie
 */
@RestController
public class CookieController {

    /**
     * 在这个示例中，访问 /setCookie 路径时，服务器将向客户端发送一个名为 name 值为 yunya2 的 Cookie。
     * @param response
     * @return
     */
    @GetMapping("/setCookie")
    public String setCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("name", "yunya2");
        cookie.setPath("/"); // 设置 Cookie 的作用路径
        cookie.setMaxAge(10); // 设置 Cookie 的有效期，单位为秒
        response.addCookie(cookie); // 将 Cookie 添加到响应中
        return "Cookie has been set";
    }

    /**
     * 当客户端（例如浏览器）向服务器发送请求时，会自动包含之前服务器设置的 Cookie。
     * 注意：使用该案例时，先请求上面的路径: /setCookie
     * 获取 Cookie
     * @param cookieValue
     * @return
     */
    @GetMapping("/getCookie")
    public String getCookie(@CookieValue(name = "name", defaultValue = "yunya") String cookieValue) {
        return "cookieValue：" + cookieValue;
    }

}
