package ir.sajem.bo;

import ir.sajem.model.User;

public interface UserBoInterface {
	
	void save(User user);
	void update(User user);
	void delete(User user);
	User findByUserName(String username);

}
