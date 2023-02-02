package spark9092.project.jifubo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/getName")
	public String getName(@RequestParam(value = "name", defaultValue = "Jifubo") String name) {
		
		log.debug("使用者姓名: " + name);
		
		return name;
	}
}
