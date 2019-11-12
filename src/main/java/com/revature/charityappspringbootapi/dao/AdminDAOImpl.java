package com.revature.charityappspringbootapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.charityappspringbootapi.model.AdminUser;

@Repository
public class AdminDAOImpl implements AdminDao {
	@Autowired
	private EntityManager em;

	public void save(AdminUser admin) {
		em.persist(admin);
	}

	public List<AdminUser> list() {
		List<AdminUser> list = em.createQuery("from AdminUser", AdminUser.class).getResultList();
		return list;
	}

}
