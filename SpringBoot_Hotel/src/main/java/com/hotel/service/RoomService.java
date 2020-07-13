package com.hotel.service;

import java.util.List;

import com.hotel.entity.Room;
import com.hotel.entity.RoomExample;

public interface RoomService {

	List<Room> findAll();
	List<Room> findAllRooms(String typeName);
	List<Room> findByCondition(RoomExample re);
	boolean add(Room room);
	boolean delete(int roomId);
	boolean update(Room room);
	
	
}
