package com.katafoni.filemanager;

import com.katafoni.filemanager.common.security.JwtProperties;
import com.katafoni.filemanager.storage.aws.AwsProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        JwtProperties.class,
        AwsProperties.class,
})
public class FilemanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilemanagerApplication.class, args);
    }

}
