package com.nagarro.javafreshertraining.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nagarro.javafreshertraining.model.User;

/* returns all database related methods */
public interface EmployeeManagementDao extends CrudRepository<User, Integer> {
	List<User> findByUserIDAndPassword(int userID, String password);
}
