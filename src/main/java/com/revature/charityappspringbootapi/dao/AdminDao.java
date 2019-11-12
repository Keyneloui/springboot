package com.revature.charityappspringbootapi.dao;

import java.util.List;

import com.revature.charityappspringbootapi.model.AdminUser;

public interface AdminDao {
	void save(AdminUser admin);

    List<AdminUser> list();

}
