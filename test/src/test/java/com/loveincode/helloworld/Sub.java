package com.loveincode.helloworld;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingFactory;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.listener.NamingEvent;

/**
 * @author yifan.hu
 * @date 2019/11/7 19:52
 */
public class Sub {

    public static void main(String[] args) throws NacosException, InterruptedException {
        //订阅的服务名
        String serviceName = "helloworld.services";
        //创建一个nacos实例
        NamingService naming = NamingFactory.createNamingService("10.0.106.43:8848");
        //订阅一个服务
        naming.subscribe(serviceName, event -> {
            if (event instanceof NamingEvent) {

                System.out.println("订阅到数据");
                System.out.println(((NamingEvent) event).getInstances());
            }
        });
        System.out.println("订阅完成，准备等数来");
        Thread.sleep(Integer.MAX_VALUE);
    }
}
