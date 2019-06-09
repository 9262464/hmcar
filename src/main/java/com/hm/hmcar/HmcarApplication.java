package com.hm.hmcar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.hm.hmcar.dao")
@EnableSwagger2
@ServletComponentScan("com.hm.hmcar.config")
public class HmcarApplication {

    public static void main(String[] args) {
        SpringApplication.run(HmcarApplication.class, args);
    }


}
