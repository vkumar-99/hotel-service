package com.vkumar.hotelservice.controllers;

import com.vkumar.hotelservice.models.request.HotelAddRequest;
import com.vkumar.hotelservice.models.responses.HotelInfo;
import com.vkumar.hotelservice.services.HotelService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService service;

    @PostMapping
    public ResponseEntity<HotelInfo> addHotelInfo(@Valid @RequestBody HotelAddRequest request) {
        HotelInfo info = service.addHotelInfo(request);
        return new ResponseEntity<>(info, HttpStatus.CREATED);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<HotelInfo> getHotelInfo(@PathVariable("hotelId") String hotelId) {
        HotelInfo hotelInfo = service.getHotelInfo(hotelId);
        return ResponseEntity.ok(hotelInfo);
    }

    @GetMapping
    public ResponseEntity<List<HotelInfo>> getAllHotels() {
        return ResponseEntity.ok(service.getAllHotels());
    }

}
