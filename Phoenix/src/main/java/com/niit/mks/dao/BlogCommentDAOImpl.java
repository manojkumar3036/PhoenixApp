package com.niit.mks.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mks.model.BlogComment;

@Repository("BlogCommentDAO")
@Transactional
public class BlogCommentDAOImpl implements BlogCommentDAO {

	@Autowired
	
	SessionFactory sessionFactory;
	
	public BlogCommentDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	public boolean saveOrUpdate(BlogComment blogComment) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(blogComment);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	public boolean delete(BlogComment blogComment) {
		try {
			sessionFactory.getCurrentSession().delete(blogComment);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public BlogComment get(int id) {
		
		return (BlogComment)sessionFactory.getCurrentSession().get(BlogComment.class,id);
	}

	public List<BlogComment> list(int blogId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
