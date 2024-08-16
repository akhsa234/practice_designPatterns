package com.bahar.practice_designpatterns.decorative;

public class CompressCloudStream implements Stream{

    private Stream stream;

    public CompressCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressedVariable = compress(data);
        stream.write(compressedVariable);
    }
    private String compress(String data){
        return data.substring(1,8);
    }
}
