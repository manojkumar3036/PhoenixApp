package com.niit.mks.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mks.model.ForumCategory;

@Repository("ForumCategoryDAO")
@Transactional
public class ForumCategoryDAOImpl implements ForumCategoryDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean saveOrUpdate(ForumCategory forumCategory) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(ForumCategory iorumCategory) {
		// TODO Auto-generated method stub
		return false;
	}

	public ForumCategory get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ForumCategory> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
