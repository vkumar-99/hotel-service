package com.vkumar.hotelservice.services.impl;

import com.vkumar.hotelservice.entities.HotelEntity;
import com.vkumar.hotelservice.exceptions.ResourceNotFoundException;
import com.vkumar.hotelservice.models.request.HotelAddRequest;
import com.vkumar.hotelservice.models.responses.HotelInfo;
import com.vkumar.hotelservice.repositories.HotelRepository;
import com.vkumar.hotelservice.services.HotelService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository repository;
    @Override
    public HotelInfo addHotelInfo(HotelAddRequest request) {
        HotelEntity entity = repository.save(convertToEntity(request));
        return mapToResponse(entity);
    }

    @Override
    public HotelInfo getHotelInfo(String hotelId) {
        HotelEntity entity = repository.findById(hotelId)
                .orElseThrow(() -> new ResourceNotFoundException());
        return mapToResponse(entity);
    }

    @Override
    public List<HotelInfo> getAllHotels() {
        return repository.findAll().stream()
                .map(this::mapToResponse)
                .toList();
    }

    private HotelEntity convertToEntity(HotelAddRequest request) {
        HotelEntity entity = new HotelEntity();
        BeanUtils.copyProperties(request, entity);
        return entity;
    }

    private HotelInfo mapToResponse(HotelEntity entity) {
        return new HotelInfo(entity.getHotelId(), entity.getName(),
                entity.getLocation(), entity.getAbout(), null);
    }
}
