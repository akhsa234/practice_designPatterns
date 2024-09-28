package com.bahar.practice_designpatterns.facade;

public class Main {
    public static void main(String[] args) {

        //version one  without facade pattern
//        var server =new NotificationServer();
//        var connection = server.connect("ip");
//        var authToken = server.authenticate("appId","key");
//        var msg = new Message("hellooooo world ");
//        server.send(authToken,msg,"target");
//        connection.disconnect();

        //version two facade pattern
        var service= new NotificationService();
        service.send("hellooooo world ", "target");
    }
}
