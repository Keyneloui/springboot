package com.revature.charityappspringbootapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.charityappspringbootapi.dao.AdminDao;
import com.revature.charityappspringbootapi.model.AdminUser;
@Service
public class AdminServiceImpl {
	
	

	    @Autowired
	    private AdminDao adminDAO;
	    
	    @Transactional
	    public void registerUser(AdminUser admin) {        
	        adminDAO.save(admin);
	    }

	    @Transactional
	    public List<AdminUser> list() {
	        return adminDAO.list();

}
}

