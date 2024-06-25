package com.yunya.websocket_client.controller;

import org.java_websocket.client.WebSocketClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WsClientController {

    @Autowired
    WebSocketClient wsClient;

    /**
     * 客户端发消息给服务端
     * @param message
     */
    @PostMapping("/send2server")
    public void send2server(@RequestBody String message) {
        wsClient.send(message);
    }

}
