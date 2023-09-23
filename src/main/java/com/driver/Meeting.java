package com.driver;

import java.time.LocalTime;

public class Meeting {
    LocalTime startTime;
    LocalTime endTime;

    public Meeting(LocalTime startTime, LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

}
