package com.hotel.service;

import java.util.List;

import com.hotel.entity.Reception;

public interface ReceptionService {

	List<Reception> findAll();
	Reception findByReceptionIdAndPassword(int receptionId,String password);
	boolean add(Reception newReception);
	boolean delete(int receptionId);
	boolean updatePassword(Reception reception,String newPassword);
	boolean update(Reception reception);
	
}
