package com.bahar.practice_designpatterns.decorative;

public class EncryptedCloudStream implements Stream{

    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }
    @Override
    public void write(String data) {
       var encriptedVariable= encrypt(data);
        stream.write(encriptedVariable);
    }

    private String encrypt (String data){

        return "!@#$^&*)(*&^%^%^";
    }
}
