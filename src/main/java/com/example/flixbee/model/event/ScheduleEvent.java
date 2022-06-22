package com.example.flixbee.model.event;

import java.util.ArrayList;

public class ScheduleEvent {
    private String title;
    private String location;
    private String startTime;
    private String endTime;
    private ArrayList<Guest> guestsList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ArrayList<Guest> getGuestsList() {
        return guestsList;
    }

    public void setGuestsList(ArrayList<Guest> guestsList) {
        this.guestsList = guestsList;
    }
}
