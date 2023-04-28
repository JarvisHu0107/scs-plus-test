package com.example.demo.test.model;

import java.util.Date;

/**
 * 创建租户ID
 *
 * @author andyzhang
 * @since 2021/12/13
 */
public class TenantMessageBuilder {

    public static Long NONE_TENANT_ID = -1L;

    /**
     * 创建租户消息 不带数据类型
     *
     * @param tenantId
     * @param data
     * @return
     */
    public static TenantMessage build(Long tenantId, Object data) {
        TenantMessage message = new TenantMessage(
                new TenantMessageData()
                        .setData(data)
                        .setTenantId(tenantId)
                        .setDateTime(new Date()));
        return message;
    }

    /**
     * 创建租户消息 不带数据类型
     *
     * @param tenantId
     * @param data
     * @return
     */
    public static TenantMessage build(String id, Long tenantId, Object data) {
        TenantMessage message = new TenantMessage(
                new TenantMessageData()
                        .setId(id)
                        .setData(data)
                        .setTenantId(tenantId)
                        .setDateTime(new Date()));
        return message;
    }

    /**
     * 创建租户消息
     *
     * @param tenantId
     * @param data
     * @param dataType
     * @return
     */
    public static TenantMessage build(Long tenantId, String dataType, Object data) {
        TenantMessage message = new TenantMessage(
                new TenantMessageData()
                        .setData(data)
                        .setTenantId(tenantId)
                        .setDataType(dataType)
                        .setDateTime(new Date()));
        return message;
    }

    /**
     * 创建租户消息
     *
     * @param tenantId
     * @param data
     * @param dataType
     * @return
     */
    public static TenantMessage build(String id, Long tenantId, String dataType, Object data) {
        TenantMessage message = new TenantMessage(
                new TenantMessageData()
                        .setId(id)
                        .setData(data)
                        .setTenantId(tenantId)
                        .setDataType(dataType)
                        .setDateTime(new Date()));
        return message;
    }

    /**
     * 创建租户消息 无租户id
     *
     * @param dataType
     * @param data
     * @return
     */
    public static TenantMessage build(String id, String dataType, Object data) {
        TenantMessage message = new TenantMessage(
                new TenantMessageData()
                        .setId(id)
                        .setData(data)
                        .setTenantId(NONE_TENANT_ID)
                        .setDataType(dataType)
                        .setDateTime(new Date()));
        return message;
    }

    /**
     * 创建租户消息 无租户id
     *
     * @param dataType
     * @param data
     * @return
     */
    public static TenantMessage build(String dataType, Object data) {
        TenantMessage message = new TenantMessage(
                new TenantMessageData()
                        .setData(data)
                        .setTenantId(NONE_TENANT_ID)
                        .setDataType(dataType)
                        .setDateTime(new Date()));
        return message;
    }
}
