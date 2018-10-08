package core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import core.model.User;
import core.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController
{
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/all")
	public List<User> getAllUsers()
	{
		return userRepository.findAll();
	}
	
	@PostMapping("/user")
	public User createUser(User newUser) 
	{
		User user=userRepository.save(newUser);
		System.out.println("New user created : "+user);
		return user;		
	}	
}
