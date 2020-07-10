package com.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.Room;
import com.hotel.entity.RoomExample;
import com.hotel.mapper.RoomMapper;
import com.hotel.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{
	
	RoomMapper roomMapper;

	public RoomMapper getRoomMapper() {
		return roomMapper;
	}

	@Autowired
	public void setRoomMapper(RoomMapper roomMapper) {
		this.roomMapper = roomMapper;
	}

	@Override
	public List<Room> findAll() {
		return roomMapper.selectByExample(null);
	}

	@Override
	public List<Room> findByCondition(RoomExample re) {
		return roomMapper.selectByExample(re);
	}

	@Override
	public boolean add(Room room) {
		int i = roomMapper.insert(room);
		return i==1?true:false;
	}

	@Override
	public boolean delete(int roomId) {
		int i = roomMapper.deleteByPrimaryKey(roomId);
		return i==1?true:false;
	}

	@Override
	public boolean update(Room room) {
		int i = roomMapper.updateByPrimaryKeySelective(room);
		return i==1?true:false;
	}
	
	
}
