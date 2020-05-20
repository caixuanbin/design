package com.xbcai.design.responsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 请假封装信息
 */
@AllArgsConstructor
@Getter
public class LeaveRequest {
    private String empName;
    private int leaveDays;
    private String reason;
}
