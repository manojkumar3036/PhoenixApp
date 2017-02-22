package com.niit.mks.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mks.model.JobApplied;

@Repository("JobAppliedDAO")
@Transactional
public class JobAppliedDAOImpl implements JobAppliedDAO {

	@Autowired
	public boolean saveOrUpdate(JobApplied jobApplied) {
		SessionFactory sessionFactory;
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(JobApplied jobApplied) {
		// TODO Auto-generated method stub
		return false;
	}

	public JobApplied get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<JobApplied> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
