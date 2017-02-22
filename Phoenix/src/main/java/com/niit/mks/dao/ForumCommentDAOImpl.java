package com.niit.mks.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mks.model.ForumComment;


@Repository
@Transactional
public class ForumCommentDAOImpl implements ForumCommentDAO {

	@Autowired
	SessionFactory sessionFactory;
	public boolean saveOrUpdate(ForumComment forumComment) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(ForumComment forumComment) {
		// TODO Auto-generated method stub
		return false;
	}

	public ForumComment get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ForumComment> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
