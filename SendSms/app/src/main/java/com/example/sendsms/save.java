package com.example.sendsms;

public class save {
   public String Stop;
    public String ChildName;
    public String Mobile;
    public save(){}

    public String getStop() {
        return Stop;
    }

    public void setStop(String stop) {
        Stop = stop;
    }

    public String getChildName() {
        return ChildName;
    }

    public void setChildName(String childName) {
        ChildName = childName;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public save(String stop, String childName, String mobile) {
        Stop = stop;
        ChildName = childName;
        Mobile = mobile;
    }
}
