package com.jky.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer  //启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class EurekaApplication {

	public static void main(String[] args) {
		//下面两行代码都可以用来启动
		SpringApplication.run(EurekaApplication.class, args);
		//new SpringApplicationBuilder(Application.class).web(true).run(args);
	}
}
