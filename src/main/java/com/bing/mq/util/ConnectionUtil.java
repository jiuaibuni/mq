package com.bing.mq.util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Description: mq
 * @author  gby
 * @date  2019/10/20 17:01
 */
public class ConnectionUtil {


    public static Connection getConnection() throws IOException, TimeoutException {

        //定义连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置服务地址
        factory.setHost("127.0.0.1");
        //设置端口
        factory.setPort(5672);
        //设置用户名
        factory.setUsername("guest");
        //设置密码
        factory.setPassword("guest");
        Connection connection = factory.newConnection();
        return connection;

    }


}
