package ir.sajem.common;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ir.sajem.bo.UserBoInterface;
import ir.sajem.model.User;

public class App {
	
	final static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BenaLocations.xml");
		
		UserBoInterface userBoInterface = (UserBoInterface) appContext.getBean("userBoInterface");
		
		/*
		 * Insert
		 */
		User user = new User();
		user.setUser("hamed");
		user.setFirst_name("hamed");
		user.setLast_name("abdy");
		user.setOrganization("sajem ltd");
		user.setEmail("hamed@abdy.com");
		user.setPhone("61368421876");
		user.setConfirm(false);
		
		/*
		 * Select
		 */
		User user2 = userBoInterface.findByUserName("hamed");
		System.out.println(user2);
		logger.info(user2);
		
		/*
		 * Update
		 */
		user2.setUser("memed");
		userBoInterface.update(user2);
		
		/*
		 * Delete
		 */
		userBoInterface.delete(user2);
		
		System.out.println("Done");
		logger.info("Done");
		
	}
	
}
