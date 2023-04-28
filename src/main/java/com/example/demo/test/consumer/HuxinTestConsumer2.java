package com.example.demo.test.consumer;


import org.springframework.stereotype.Component;

import com.demo.scs.core.business.BusinessMQEventListener;
import com.demo.scs.core.business.MQConsumerEventListener;
import com.example.demo.test.entity.UserStatusChangeBean;
import com.example.demo.test.model.TenantMessageData;
import lombok.extern.slf4j.Slf4j;

/**
 * 回调消费者使用泛型接收，进行反序列化
 *
 * @author
 */
@Component
@Slf4j
@BusinessMQEventListener("huxintestInput")
public class HuxinTestConsumer2 extends MQConsumerEventListener<TenantMessageData<UserStatusChangeBean>> {

    @Override
    public void onMessage(TenantMessageData<UserStatusChangeBean> message) {

        System.out.println("consumer:1123 --- " + message);
    }



}
