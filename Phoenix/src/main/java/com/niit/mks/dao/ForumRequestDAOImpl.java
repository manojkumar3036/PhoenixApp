package com.niit.mks.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.mks.model.ForumRequest;

@Repository("forumRequestDAO")
public class ForumRequestDAOImpl implements ForumRequestDAO {

	@Autowired
	SessionFactory sessionFactory;
	public boolean saveOrUpdate(ForumRequest forumRequest) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<ForumRequest> getByStatus(String status, int forumId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ForumRequest> getByUserStatus(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ForumRequest get(int userId, int forumId) {
		// TODO Auto-generated method stub
		return null;
	}

}
