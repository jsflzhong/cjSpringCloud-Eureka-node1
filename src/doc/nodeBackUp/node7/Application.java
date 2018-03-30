package com.michael.springBoot;

import com.michael.springBoot.dao.BaseMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages="com.michael.springBoot.dao",markerInterface = BaseMapper.class)
//@EnableScheduling
//@EnableEurekaServer
@EnableDiscoveryClient //feign客户端
@EnableFeignClients		//feign客户端
@EnableHystrixDashboard	//hystrix仪表盘监控器
@EnableCircuitBreaker	//hystrix监控器汇总工具s
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
