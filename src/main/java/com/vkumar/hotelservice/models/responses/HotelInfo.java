package com.vkumar.hotelservice.models.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelInfo {

    private String hotelId;
    private String name;
    private String location;
    private String about;
    //private List<Rating> rating;
}
