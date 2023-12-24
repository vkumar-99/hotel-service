package com.vkumar.hotelservice.repositories;

import com.vkumar.hotelservice.entities.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, String> {
}
