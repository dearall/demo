package org.sansovo.dubbodemo.controller;


import org.apache.dubbo.config.annotation.Reference;
import org.sansovo.dubbodemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {

	@Reference
	private UserService userService;
	
	@RequestMapping("/showName")
	@ResponseBody
	public String showName() {
		
		return userService.getName();
	}
}
