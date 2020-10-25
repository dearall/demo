package org.sansovo.dubbodemo.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.sansovo.dubbodemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Override
	public String getName() {
		
		logger.info("return name is '{}'", "hellodubbo");
		return "hellodubbo";
	}

}
