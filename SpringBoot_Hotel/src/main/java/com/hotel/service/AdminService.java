package com.hotel.service;

import java.util.List;

import com.hotel.entity.Admin;

public interface AdminService {
	
	
	Admin findByAnameAndPassword(String name,String password);
	List<Admin> findAll();
	//根据name和原有password，更改密码
	boolean updatePassword(Admin admin,String newPassword);
	
}
