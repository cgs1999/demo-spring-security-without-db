package com.duoduo.system.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.duoduo.system.model.User;

/**
 * TODO
 * @author chengesheng@gmail.com
 * @date 2014-6-23 下午2:32:03
 * @version 1.0.0
 */
@Repository("userDao")
public class UserDao {

	protected static Logger logger = Logger.getLogger("dao");

	public User getDatabase(String username) {

		List<User> users = internalDatabase();

		for (User dbUser : users) {
			if (dbUser.getUsername().equals(username) == true) {
				logger.debug("User found");
				return dbUser;
			}
		}
		logger.error("User does not exist!");
		throw new RuntimeException("User does not exist!");

	}

	/**
	 * 初始化数据
	 */
	private List<User> internalDatabase() {

		List<User> users = new ArrayList<User>();
		User user = null;

		user = new User();
		user.setUsername("admin");

		// "admin"经过MD5加密后
		user.setPassword("21232f297a57a5a743894a0e4a801fc3");
		user.setAccess(1);

		users.add(user);

		user = new User();
		user.setUsername("user");

		// "user"经过MD5加密后
		user.setPassword("ee11cbb19052e40b07aac0ca060c23ee");
		user.setAccess(2);

		users.add(user);

		return users;

	}
}
