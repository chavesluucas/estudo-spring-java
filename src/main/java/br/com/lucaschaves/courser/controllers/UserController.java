package br.com.lucaschaves.courser.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucaschaves.courser.entities.User;

@RestController
@RequestMapping(value = "/api/users")
@CrossOrigin("*")
public class UserController {
	
	//EndPoint para acessar os usuarios
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L,"Maria","maria.com","4799999","12345");
		
		return ResponseEntity.ok().body(u);
	}

}
