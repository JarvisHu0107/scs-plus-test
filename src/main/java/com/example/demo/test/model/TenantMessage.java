package com.example.demo.test.model;

import java.util.Map;

import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;

import lombok.experimental.Accessors;

/**
 * Tenant 消息体
 *
 * @author andyzhang
 * @since 2021/12/09
 */
@Accessors(chain = true)
public class TenantMessage extends GenericMessage<TenantMessageData> {
    private static final long serialVersionUID = -5470210965279837798L;

    public TenantMessage(TenantMessageData payload) {
        super(payload);
    }

    public TenantMessage(TenantMessageData payload, Map<String, Object> headers) {
        super(payload, headers);
    }

    public TenantMessage(TenantMessageData payload, MessageHeaders headers) {
        super(payload, headers);
    }
}
