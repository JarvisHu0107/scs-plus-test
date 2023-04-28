package com.example.demo.test.consumer;


import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.example.demo.test.entity.UserStatusChangeBean;
import com.example.demo.test.model.TenantMessageData;
import lombok.extern.slf4j.Slf4j;

/** 测试兼容原生使用方式
 * @Author: Hu Xin
 * @Date: 2023/1/5 15:46
 * @Desc:
 **/
@Slf4j
@Component
public class ScsConsumer {


    @StreamListener("userStatusChangeConsumer")
    public void consumerMsg(Message<TenantMessageData<UserStatusChangeBean>> msg) {
        TenantMessageData<UserStatusChangeBean> payload = msg.getPayload();
        Long tenantId = payload.getTenantId();
        log.info("消费消息,msg:{}", msg);


    }

//    @StreamListener("huxintestInput")
//    public void consume(Message<String> msg) {
//        log.info("消费消息,msg:{}", msg);
//
//
//    }


}
