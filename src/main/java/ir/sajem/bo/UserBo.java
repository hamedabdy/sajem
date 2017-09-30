package ir.sajem.bo;

import ir.sajem.model.User;

public class UserBo implements UserBoInterface {

	UserDaoInterface userDaoInterface;
	
	
	public void setUserDaoInterface(UserDaoInterface userDaoInterface) {
		this.userDaoInterface = userDaoInterface;
	}
	
	@Override
	public void save(User user) {
		userDaoInterface.save(user);
	}

	@Override
	public void update(User user) {
		userDaoInterface.update(user);
	}

	@Override
	public void delete(User user) {
		userDaoInterface.delete(user);
	}

	@Override
	public User findByUserName(String username) {
		return userDaoInterface.findByUsername(username);
	}

}
