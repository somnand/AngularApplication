package core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import core.model.User;
import core.repository.UserRepository;

//@EnableAutoConfiguration
//@ComponentScan(basePackages= {"controller","repository"},basePackageClasses=UserRepository.class)
@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		//Adding functions to add users into H2 DB.
		userRepository.save(new User("Somsurya","Nanda"));
		userRepository.save(new User("Sandhya","Pai"));
		userRepository.save(new User("Jagath","Prabhu"));
		userRepository.save(new User("Utkarsh","Jain"));
		userRepository.save(new User("Rahul","Tarkar"));
	}
	
	
}
