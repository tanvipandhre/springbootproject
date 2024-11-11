package com.tanvi.SpringbootDemo2;

import com.tanvi.SpringbootDemo2.model.Laptop;
import com.tanvi.SpringbootDemo2.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDemo2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootDemo2Application.class, args);
		System.out.println("Hello World");
		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

//		Alien obj = context.getBean(Alien.class); //through this we can communicate with the IoC container
//		obj.code();
//		System.out.println(obj.getAge());

	}

}
