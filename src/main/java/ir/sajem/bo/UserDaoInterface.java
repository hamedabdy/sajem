package ir.sajem.bo;

import ir.sajem.model.User;

public interface UserDaoInterface {

	void save(User user);
	void update(User user);
	void delete(User user);
	User findByUsername(String username);
	
}
