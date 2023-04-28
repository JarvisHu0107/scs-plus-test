package com.example.demo.test.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 租户消息
 *
 * @author andyzhang
 * @since 2021/12/09
 */
@Data
@Accessors(chain = true)
public class TenantMessageData<T> implements Serializable {
    private static final long serialVersionUID = -5470210965279837799L;

    private String id;
    private Long tenantId;
    private T data;
    private Date dateTime;
    private String dataType;

    public TenantMessageData() {

    }
}
