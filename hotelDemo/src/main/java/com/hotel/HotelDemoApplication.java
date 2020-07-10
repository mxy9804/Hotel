package com.hotel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hotel.mapper")
public class HotelDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelDemoApplication.class, args);
	}

}
