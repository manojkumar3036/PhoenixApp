package com.niit.mks.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mks.model.Job;

@Repository("JobDAO")
@Transactional
public class JobDAOImpl implements JobDAO {

	@Autowired
	SessionFactory sessionFactory;
	public boolean saveOrUpdate(Job job) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Job job) {
		// TODO Auto-generated method stub
		return false;
	}

	public Job get(int jobId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Job> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public Job getByJobProfile(String jobProfile) {
		// TODO Auto-generated method stub
		return null;
	}

}
