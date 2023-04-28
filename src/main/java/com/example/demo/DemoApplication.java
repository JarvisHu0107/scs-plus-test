package com.example.demo;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.scs.annotation.EnableBindingEnhance;
import com.example.demo.test.CustomizeProcessorPlus;
import com.example.demo.test.entity.UserStatusChangeBean;
import com.example.demo.test.model.TenantMessage;
import com.example.demo.test.model.TenantMessageBuilder;


@SpringBootApplication
@RestController
@EnableBindingEnhance(CustomizeProcessorPlus.class)
//@EnableBindingEnhance
public class DemoApplication implements CommandLineRunner {

    @Resource
    private MessageChannel userStatusChangeProducer;

    @Resource
    private MessageChannel huxintestOutput;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/testSend")
    public void testSend() {
        UserStatusChangeBean bean = UserStatusChangeBean.builder().changeType(UserStatusChangeBean.USER_DELETE).tenantId(111L).userId(1L).username("testUsername").build();
        TenantMessage message = TenantMessageBuilder.build(bean.getTenantId(), bean);

        //huxintestInput.send(message);
//        TenantMessageData<UserStatusChangeBean> payload = (TenantMessageData<UserStatusChangeBean>)message.getPayload();
//        Message<TenantMessageData<UserStatusChangeBean>> msg = MessageBuilder.withPayload(payload).build();


        huxintestOutput.send(message);
        //MQSenderUtil.sendMsg("huxintestOutput", message);

        // userStatusChangeProducer.send(message);


    }


    @Override
    public void run(String... args) throws Exception {

    }
}
