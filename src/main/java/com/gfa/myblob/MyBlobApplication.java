package com.gfa.myblob;

import com.gfa.myblob.models.User;
import com.gfa.myblob.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBlobApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBlobApplication.class, args);
	}
}
