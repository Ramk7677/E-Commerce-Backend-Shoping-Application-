package com.spring;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.model.User;
import com.spring.repository.UserRepository;
import com.spring.utility.Validator;

@SpringBootTest
class ShoppingApplicationTests {

	@Autowired
	UserRepository userRepository;
	
	
	//@Test
	void test() {
		
		Optional<User> user = userRepository.findByUsername("abc");
		
		System.out.println(user.get());	
		
	}
	
	  //@Test
	  void test1()
	  {
		User user=new User();
		user.setEmail("jjjj@gmail.com");
		user.setFullname("dsgdfsg");
		user.setPassword("355dfgfd");
		user.setUsertype("customer");
		user.isEnabled();
		user.setUsername("sdfds");
		
		userRepository.save(user);
		
		
		
	  }
	  
	  //@Test
	  void emailTest()
	  {
		System.out.println(userRepository.findByemail("dfefs@gmail.com").get());
	  }

}
