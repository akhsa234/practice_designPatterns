package com.bahar.practice_designpatterns;

import com.bahar.practice_designpatterns.decorative.CloudStream;
import com.bahar.practice_designpatterns.decorative.CompressCloudStream;
import com.bahar.practice_designpatterns.decorative.EncryptedCloudStream;
import com.bahar.practice_designpatterns.decorative.Stream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeDesignPatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeDesignPatternsApplication.class, args);
        //var cloudStream = new CloudStream();
//        var cloudStream = new EncryptedCloudStream();
//        cloudStream.write("hi . i am bahar. one of your friend. ");
        storeCreditCard(new CompressCloudStream(new EncryptedCloudStream(new CloudStream())));

    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }


}
