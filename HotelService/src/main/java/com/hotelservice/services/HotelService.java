package com.hotelservice.services;

import java.util.List;

import com.hotelservice.entites.Hotel;

public interface HotelService {
	
    Hotel create(Hotel hotel);
    List<Hotel> getAll();
    Hotel get(String id);

}
