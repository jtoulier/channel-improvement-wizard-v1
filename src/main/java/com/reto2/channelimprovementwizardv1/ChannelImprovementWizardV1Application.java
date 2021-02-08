package com.reto2.channelimprovementwizardv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@EnableFeignClients
@SpringBootApplication
public class ChannelImprovementWizardV1Application {

	public static void main(String[] args) {
		SpringApplication.run(ChannelImprovementWizardV1Application.class, args);
	}

}
