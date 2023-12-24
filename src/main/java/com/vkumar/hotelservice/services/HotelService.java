package com.vkumar.hotelservice.services;

import com.vkumar.hotelservice.models.request.HotelAddRequest;
import com.vkumar.hotelservice.models.responses.HotelInfo;

import java.util.List;

public interface HotelService {

    HotelInfo addHotelInfo(HotelAddRequest request);

    HotelInfo getHotelInfo(String hotelId);

    List<HotelInfo> getAllHotels();
}
