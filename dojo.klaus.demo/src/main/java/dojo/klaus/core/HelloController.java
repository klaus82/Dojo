package dojo.klaus.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Commento prova
@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(){
		
		return "Hello, World!";
		
	}
	
	

}
