package com.company;

public class StopWatch {
    private long StartTime;
    private long EndTime;

    public StopWatch(){
       StartTime=System.currentTimeMillis();
    }
public long getStartTime(){
        return StartTime;
    }
public long getEndTime(){
        return EndTime;
}
public void setStart(){
        StartTime = System.currentTimeMillis();
}

    public void setEndTime() {
        EndTime = System.currentTimeMillis();
    }
}
