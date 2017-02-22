package com.niit.mks.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mks.model.Blog;

@Repository("blogDAO")
@Transactional
public class BlogDAOImpl implements BlogDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public BlogDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	public boolean saveOrUpdate(Blog blog) {
		
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(blog);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	public boolean delete(Blog blog) {
		try {
		sessionFactory.getCurrentSession().delete(blog);
		return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	public Blog get(int blogId) {
	
		return (Blog)sessionFactory.getCurrentSession().get(Blog.class,blogId);
		
	}

	public List<Blog> getByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Blog> list() {
		return sessionFactory.getCurrentSession().createQuery("From Blog").list();
	}

	public List<Blog> getblogsByStatus(String status)
	{
		return null;
		
	}

	public List<Blog> getTopBlogs(int n) {
		// TODO Auto-generated method stub
		return null;
	}

}
