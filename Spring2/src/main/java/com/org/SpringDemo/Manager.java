package com.org.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {
 
    Accountant acc ;
    Security scc;
    Administration add;
    public Manager(Accountant acc , Security scc, Administration add) {
        System.out.println("Manager Constructor");
        this.acc = acc;
        this.add=add;
        this.scc=scc;
    }
    public void doWork() {
        // TODO Auto-generated method stub
     System.out.println(" Manager  - Manage the branch Office ");
    }
 
    public void callMeeting() {
        acc.doWork();
        scc.doWork();
        add.doWork();
    }
}
