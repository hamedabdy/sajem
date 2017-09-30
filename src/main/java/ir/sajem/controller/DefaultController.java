package ir.sajem.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ir.sajem.bo.UserBoInterface;
import ir.sajem.model.User;

@Controller
public class DefaultController {

	
	
	@RequestMapping(value = "/")
	public String serveHome() {
		
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("/config/BeanLocations.xml");
//		
//		UserBoInterface userBoInterface = (UserBoInterface) appContext.getBean("userBoInterface");
//		
//		/*
//		 * Insert
//		 */
//		User user = new User();
//		user.setUser("hamed");
//		user.setFirst_name("hamed");
//		user.setLast_name("abdy");
//		user.setOrganization("sajem ltd");
//		user.setEmail("hamed@abdy.com");
//		user.setPhone("61368421876");
//		user.setConfirm(false);
//		
		return "index";
	}
	
}
