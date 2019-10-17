package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Car BMW = new Car("black", "AUtomatic", "Hatchbag", "Park", 0);
        BMW.move(5);
        System.out.println("Status of the car is: " + BMW.getCar_status());
        BMW.stop(0);
        BMW.reverse(-20);
        System.out.println("Design of the car is: " + BMW.getCar_design());
        System.out.println("Color of the car is: " + BMW.getCar_color());
        System.out.println("Type of the car is: " + BMW.getCar_type());
        System.out.println("Speed of the car is: " + BMW.getCar_speed());
        BMW.stop(0);
		SpringApplication.run(DemoApplication.class, "Yo How's it going?");
	}

}
