package com.niit.mks.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mks.model.Friend;

@Repository("FriendDAO")
@Transactional
public class FriendDAOImpl implements FriendDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean saveOrUpdate(Friend friend) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Friend friend) {
		// TODO Auto-generated method stub
		return false;
	}

	public Friend get(int userId, int friendId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Friend> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Friend> getFriends(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Friend> myFriends(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Friend> getRequest(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Friend> getTopFriends(int n) {
		// TODO Auto-generated method stub
		return null;
	}

}
