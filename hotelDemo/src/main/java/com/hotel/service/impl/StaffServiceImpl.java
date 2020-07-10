package com.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.Staff;
import com.hotel.entity.StaffExample;
import com.hotel.mapper.StaffMapper;
import com.hotel.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService{

	StaffMapper staffMapper;
	
	
	
	public StaffMapper getStaffMapper() {
		return staffMapper;
	}
	
	@Autowired
	public void setStaffMapper(StaffMapper staffMapper) {
		this.staffMapper = staffMapper;
	}

	@Override
	public List<Staff> findAll() {
		return staffMapper.selectByExample(null);
	}

	@Override
	public List<Staff> findByCondition(StaffExample se) {
		return staffMapper.selectByExample(se);
	}

	@Override
	public boolean update(Staff staff) {
		int i = staffMapper.updateByPrimaryKeySelective(staff);
		return i==1?true:false;
	}

	@Override
	public boolean delete(int staffId) {
		int i = staffMapper.deleteByPrimaryKey(staffId);
		return i==1?true:false;
	}

	@Override
	public boolean add(Staff staff) {
		int i = staffMapper.insert(staff);
		return i==1?true:false;
	}
	
	
	
}
