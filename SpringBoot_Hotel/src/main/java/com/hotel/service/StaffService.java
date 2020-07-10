package com.hotel.service;

import java.util.List;

import com.hotel.entity.Staff;
import com.hotel.entity.StaffExample;

public interface StaffService {
	
	List<Staff> findAll();
	List<Staff> findByCondition(StaffExample se);
	boolean update(Staff staff);
	boolean delete(int staffid);
	boolean add(Staff staff);
	
}
