package com.yuxin.esipiviemodule.parser.ade;

import java.util.Calendar;

/**
 * This is a basic course entity.
 * There is an example:
 * BEGIN:VCALENDAR
 * METHOD:PUBLISH
 * PRODID:-//ADE/version 6.0
 * VERSION:2.0
 * CALSCALE:GREGORIAN
 * BEGIN:VEVENT
 * DTSTAMP:20171122T113221Z
 * DTSTART:20171219T130000Z
 * DTEND:20171219T150000Z
 * SUMMARY:Ingénierie Systemes d'Info
 * LOCATION:INFO 2 StS
 * DESCRIPTION:\nSI 2 FISE\nSEMMAK FARIDA\n(Modifié le:17/11/2017 15:32)
 * UID:ADE60342d50524f4a4554555045432d323031372d323031382d31303136352d302d33
 * Created by yuxin on 22/11/2017.
 */

public class BaseEvent {
    private String summary;
    private String location;
    private String desc;
    private Calendar startTime;
    private Calendar endTime;
    private String prof;

    public BaseEvent(){}

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public Calendar getEndTime() {
        return endTime;
    }

    public void setEndTime(Calendar endTime) {
        this.endTime = endTime;
    }

    public String setProf(){
        this.prof = desc.split("\\n")[1];
        return prof;
    }
}
