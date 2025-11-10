package com.K23CNT2_Nvm.K23CNT2_Nvm_Lesson04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class K23Cnt2NvmLesson04Application {
    public static void main(String[] args) {
        SpringApplication.run(K23Cnt2NvmLesson04Application.class, args);
    }
}
