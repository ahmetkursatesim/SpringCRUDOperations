package com_Spring.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com_Spring.model.*;

@Repository
public interface UserDao {
	public List listAllUsers();
	 
	 public void addUser(User user);
	 
	 public void updateUser(User user);
	 
	 public void deleteUser(int id);
	 
	 public User findUserById(int id);

}
