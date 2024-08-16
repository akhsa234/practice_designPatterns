package com.bahar.practice_designpatterns.decorative;

public class CloudStream implements Stream{
    public void write(String data){
        System.out.println("Stroing ..." + data);
    }
}
