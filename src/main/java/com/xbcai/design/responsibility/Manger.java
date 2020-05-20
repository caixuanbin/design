package com.xbcai.design.responsibility;

/**
 * 经理
 */
public class Manger extends Leader {
    public Manger(String name){
        super(name);
    }
    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<10){
            System.out.println("员工："+leaveRequest.getEmpName()+"请假，天数："+leaveRequest.getLeaveDays()+",理由："+leaveRequest.getReason());
            System.out.println("经理："+this.name+" 审批通过");
        }else{
            if(this.nextLeader!=null){
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
