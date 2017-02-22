package com.niit.mks.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mks.model.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	User user;

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Boolean saveOrUpdate(User user) {

		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean delete(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public User getByUsername(String username) {
		try {
			Query query = (Query) sessionFactory.getCurrentSession().get(User.class, username);
			User user = (User) query.setParameter("username", username);
			return user;
		} catch (Exception e) {
			return null;
		}
	}

	public User getById(int userId) {
		return (User) sessionFactory.getCurrentSession().get(User.class, userId);
	}

	@SuppressWarnings("unchecked")
	public List<User> list() {
		
		return sessionFactory.getCurrentSession().createQuery("From User").list();
	}

	public List<User> getUsersByStatus(String status) {
		
		return null;
	}

	public boolean updateUserProfileId(String fileName, int userId) {
		return false;
	}

	public User validate(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getTopUsers(int n) {
		// TODO Auto-generated method stub
		return null;
	}

}