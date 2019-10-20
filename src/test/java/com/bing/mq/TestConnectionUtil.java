package com.bing.mq;

import com.bing.mq.util.ConnectionUtil;
import com.rabbitmq.client.Connection;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Description: mq
 *
 * @author gby
 * @date 2019/10/20 17:14
 */
public class TestConnectionUtil {

    @Test
    public void TestGetCOnnection() throws IOException, TimeoutException {

        Connection connection = ConnectionUtil.getConnection();

        System.out.println(connection);


    }

}
