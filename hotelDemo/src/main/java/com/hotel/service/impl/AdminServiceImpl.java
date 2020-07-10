package com.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.Admin;
import com.hotel.entity.AdminExample;
import com.hotel.mapper.AdminMapper;
import com.hotel.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService{
	
	private AdminMapper adminMapper;

	public AdminMapper getAdminMapper() {
		return adminMapper;
	}

	@Autowired
	public void setAdminMapper(AdminMapper adminMapper) {
		this.adminMapper = adminMapper;
	}

	@Override
	public Admin findByAnameAndPassword(String aname, String password) {
		AdminExample ae = new AdminExample();
		ae.createCriteria().andAdminUsernameEqualTo(aname).andAdminPasswordEqualTo(password);
		List<Admin> admins = adminMapper.selectByExample(ae);
		if(admins.size()!=1){
			return null;
		}else{
			return admins.get(0);
		}
	}

	@Override
	public List<Admin> findAll() {
		List<Admin> list = adminMapper.selectByExample(null);
		return list;
	}
	
	//根据name和原有password，更改密码

	@Override
	public boolean updatePassword(Admin admin, String newPassword) {
		admin.setAdminPassword(newPassword);
		int i = adminMapper.updateByPrimaryKeySelective(admin);
		return i==1?true:false;
	}
	
	
	
}
