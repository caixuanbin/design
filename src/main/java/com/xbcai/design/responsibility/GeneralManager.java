package com.xbcai.design.responsibility;

/**
 * 总经理
 */
public class GeneralManager extends Leader {
    public GeneralManager(String name){
        super(name);
    }
    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<30){
            System.out.println("员工："+leaveRequest.getEmpName()+"请假，天数："+leaveRequest.getLeaveDays()+",理由："+leaveRequest.getReason());
            System.out.println("总经理："+this.name+" 审批通过");
        }else{
            //如果超出了30天
            System.out.println("莫非"+leaveRequest.getEmpName()+"想辞职，请假天数："+leaveRequest.getLeaveDays());
        }
    }
}
