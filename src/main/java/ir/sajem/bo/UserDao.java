package ir.sajem.bo;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import ir.sajem.model.User;

public class UserDao extends HibernateDaoSupport implements UserDaoInterface {

	@Override
	public void save(User user) {
		getHibernateTemplate().save(user);
	}

	@Override
	public void update(User user) {
		getHibernateTemplate().update(user);
	}

	@Override
	public void delete(User user) {
		getHibernateTemplate().delete(user);
	}

	@Override
	public User findByUsername(String username) {
		List list = getHibernateTemplate().find("from users where username=?", username);
		return (User) list.get(0);
	}

}
