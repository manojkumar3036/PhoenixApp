package com.niit.mks.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mks.model.Event;

@Repository("eventDAO")
@Transactional
public class EventDAOImpl implements EventDAO {

	@Autowired
	SessionFactory sessionFactory;

	public boolean saveOrUpdate(Event event) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Event event) {
		// TODO Auto-generated method stub
		return false;
	}

	public Event get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Event> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
