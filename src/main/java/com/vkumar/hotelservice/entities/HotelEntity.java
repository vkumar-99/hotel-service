package com.vkumar.hotelservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hotel_info")
@Getter
@Setter
@NoArgsConstructor
public class HotelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String hotelId;
    private String name;
    private String location;
    private String about;
}
