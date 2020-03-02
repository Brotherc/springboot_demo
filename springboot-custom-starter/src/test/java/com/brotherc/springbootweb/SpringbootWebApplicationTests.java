package com.brotherc.springbootweb;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootWebApplicationTests {

    @Autowired
    private HttpClient httpClient;

    @Test
    public void testHttpClient() throws Exception {
        System.out.println(httpClient.execute(new HttpGet("http://www.baidu.com")).getEntity().getContent());
    }

}
