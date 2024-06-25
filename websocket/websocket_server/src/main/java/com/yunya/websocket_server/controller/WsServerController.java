package com.yunya.websocket_server.controller;

import com.yunya.websocket_server.server.WsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务端请求类
 */
@RestController
public class WsServerController {

    @Autowired
    WsServer wsServer;

    /**
     * 服务端发送消息给客户端
     */
    @PostMapping("/send2client")
    public void send2client(@RequestBody String message) {
        wsServer.sendMessageToAll(message);
    }

}
