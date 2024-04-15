package com.hotelservice.respositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelservice.entites.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
