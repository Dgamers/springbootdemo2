package com.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.dao.UserRepository;
import com.demo.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demotest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void delete() {
		User user1 = userRepository.findOne(11);
		User user2 = userRepository.findOne(10);
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		userRepository.delete(users);

	}
	@Test
	public void findall() {
		List<User> list = (List<User>) userRepository.findAll();
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	public void findone() {
		User user = userRepository.findOne(1);
		System.out.println(user);
	}

	@Test
	public void findUserByName() {
		String str = "%aa%";
		User user = userRepository.findUserByName(str);
		System.out.println(user);
	}

	@Test
	public void save() {
		User user = new User();
		user.setName("1234567890");
		userRepository.save(user);
	}

	@Test
	public void update() {
		userRepository.update("1111", 9);
	}

	@Test
	public void update2() {
		User user = userRepository.findOne(9);
		user.setName("mmmm");
		userRepository.save(user);
	}
}
