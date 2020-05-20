package com.xbcai.design.responsibility;

/**
 * 主任
 */
public class Director extends Leader {
    public Director(String name){
        super(name);
    }
    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<3){
            System.out.println("员工："+leaveRequest.getEmpName()+"请假，天数："+leaveRequest.getLeaveDays()+",理由："+leaveRequest.getReason());
            System.out.println("主任："+this.name+" 审批通过");
        }else{
            if(this.nextLeader!=null){
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
