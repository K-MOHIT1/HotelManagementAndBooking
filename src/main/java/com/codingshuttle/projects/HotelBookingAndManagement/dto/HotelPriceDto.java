package com.codingshuttle.projects.HotelBookingAndManagement.dto;

import com.codingshuttle.projects.HotelBookingAndManagement.entity.Hotel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelPriceDto {
    private Hotel hotel;
    private Double price;
}
