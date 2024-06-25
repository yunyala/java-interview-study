package com.yunya.websocket_server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * websocket配置类
 * 该配置类用于创建ServerEndpoint注解，此注解用在类上，使得此类成为服务端websocket
 */
@Configuration
public class WsServerConfig {
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
