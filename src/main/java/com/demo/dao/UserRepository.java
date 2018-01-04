package com.demo.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.pojo.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("select u from user u where u.name like ?1")
	public User findUserByName(String name);

	@Modifying
	@Transactional
	@Query("update user u set u.name=?1 where u.id=?2")
	public void update(String name, Integer id);

}
