package com_Spring.service;
 import java.util.List;

import org.springframework.stereotype.Service;

import com_Spring.model.User;
@Service
public interface UserService {
	
	 public List listAllUsers();
	 
	 public void addUser(User user);
	 
	 public void updateUser(User user);
	 
	 public void deleteUser(int id);
	 
	 public User findUserById(int id);

}
