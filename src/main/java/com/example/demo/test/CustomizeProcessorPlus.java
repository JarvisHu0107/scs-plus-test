package com.example.demo.test;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * demo只是作为演示兼容原生使用方式，可以忽略
 *
 * @Author: Hu Xin
 * @Date: 2023/1/16 20:24
 * @Desc:
 **/
public interface CustomizeProcessorPlus {


    String USER_STATUS_CHANGE_INPUT = "userStatusChangeConsumer";

    @Input(CustomizeProcessorPlus.USER_STATUS_CHANGE_INPUT)
    SubscribableChannel userStatusChangeConsumer();

    @Output("huxintestOutput")
    MessageChannel huxintestOutput();
}
