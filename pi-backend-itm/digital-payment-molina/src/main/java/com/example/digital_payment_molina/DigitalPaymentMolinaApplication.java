package com.example.digital_payment_molina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DigitalPaymentMolinaApplication {


	public static void main(String[] args) {
		SpringApplication.run(DigitalPaymentMolinaApplication.class, args);
	}

}
