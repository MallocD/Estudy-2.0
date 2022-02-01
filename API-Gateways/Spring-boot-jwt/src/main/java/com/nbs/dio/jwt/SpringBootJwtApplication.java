package com.nbs.dio.jwt;

import com.nbs.dio.jwt.data.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class SpringBootJwtApplication {
	@Autowired
	private static UserData user;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtApplication.class, args);
	}

	@Bean//Anotação para configuração do component
	public BCryptPasswordEncoder bCryptPasswordEncoder(){//Esse método irá servir para encripitar as senhas
		return new BCryptPasswordEncoder();
	}


}
