package com.niit.mks.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mks.model.Forum;

@Repository("forumDAO")
@Transactional
public class ForumDAOImpl implements ForumDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public ForumDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	public boolean saveOrUpdate(Forum forum) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Forum forumId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Forum get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Forum getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Forum> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Forum> getForumsByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Forum> getForumsByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Forum> getTopForums(int n) {
		// TODO Auto-generated method stub
		return null;
	}

}
