package com.yunya.websocket_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

/**
 * websocket服务端
 * EnableWebSocket注解用于开启websocket服务
 */
@EnableWebSocket
@SpringBootApplication
public class WebsocketServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsocketServerApplication.class, args);
    }

}
