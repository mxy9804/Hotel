package com.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.Admin;
import com.hotel.entity.AdminExample;
import com.hotel.entity.Reception;
import com.hotel.entity.ReceptionExample;
import com.hotel.mapper.ReceptionMapper;
import com.hotel.service.ReceptionService;


@Service
public class ReceptionImpl implements ReceptionService{

	ReceptionMapper receptionMapper;
	
	public ReceptionMapper getReceptionMapper() {
		return receptionMapper;
	}

	@Autowired
	public void setReceptionMapper(ReceptionMapper receptionMapper) {
		this.receptionMapper = receptionMapper;
	}

	@Override
	public List<Reception> findAll() {
		return receptionMapper.selectByExample(null);
	}

	@Override
	public boolean add(Reception newReception) {
		int i = receptionMapper.insert(newReception);
		return i==1?true:false;
	}

	@Override
	public boolean delete(int receptionId) {
		int i = receptionMapper.deleteByPrimaryKey(receptionId);
		return i==1?true:false;
	}

	@Override
	public boolean updatePassword(Reception reception, String newPassword) {
		reception.setReceptionPassword(newPassword);
		int i = receptionMapper.updateByPrimaryKeySelective(reception);
		return i==1?true:false;
	}

	@Override
	public Reception findByReceptionIdAndPassword(int receptionId,String password) {
		ReceptionExample re = new ReceptionExample();
		re.createCriteria().andReceptionIdEqualTo(receptionId).andReceptionPasswordEqualTo(password);
		List<Reception> list = receptionMapper.selectByExample(re);
		if(list.size()!=1){
			return null;
		}else{
			return list.get(0);
		}
	}

	@Override
	public boolean update(Reception reception) {
		int i = receptionMapper.updateByPrimaryKeySelective(reception);
		return i==1?true:false;
	}
	
	
	
	
	
}
