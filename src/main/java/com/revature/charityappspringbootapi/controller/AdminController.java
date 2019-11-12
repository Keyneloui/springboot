package com.revature.charityappspringbootapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.charityappspringbootapi.model.AdminUser;
import com.revature.charityappspringbootapi.service.AdminServiceImpl;

@RestController
@RequestMapping("users")

public class AdminController {
	@Autowired
	private AdminServiceImpl adminService;

	@GetMapping("/register")
	public @ResponseBody void register(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String password,@RequestParam("mobile_no") String mobileNo) {
		System.out.println("AdminController->save");
		AdminUser user = new AdminUser();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setMobileNo(mobileNo);

		adminService.registerUser(user);

	}

	@GetMapping("/list")
	public List<AdminUser> list() {
		List<AdminUser> list = adminService.list();
		return list;
	}
}
