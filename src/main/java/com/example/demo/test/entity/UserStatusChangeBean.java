package com.example.demo.test.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户状态变更事件数据
 *
 * @author wangyi
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserStatusChangeBean implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String USER_STATUS_CHANGE = "USER_STATUS_CHANGE";
    public static final String USER_DELETE = "USER_DELETE";

    /**
     * 改变类型 USER_STATUS_CHANGE-用户状态改变, USER_DELETE-用户删除
     */
    private String changeType;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户原状态 ENABLE-启用, DISABLE-禁用, LOCK-锁定, EXPIRE-过期
     */
    private String oldStatus;

    /**
     * 用户新状态 ENABLE-启用, DISABLE-禁用, LOCK-锁定, EXPIRE-过期
     */
    private String newStatus;

}
