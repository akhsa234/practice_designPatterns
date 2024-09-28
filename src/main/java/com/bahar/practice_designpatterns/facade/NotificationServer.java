package com.bahar.practice_designpatterns.facade;

public class NotificationServer {

    public Connection connect(String ipAddress){
        return new Connection();
    }

    public AuthToken authenticate(String appID, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message msg , String target){
        System.out.println("sending a msg !!!!");

    }
}
