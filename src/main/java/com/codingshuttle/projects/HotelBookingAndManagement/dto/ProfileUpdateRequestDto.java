package com.codingshuttle.projects.HotelBookingAndManagement.dto;

import com.codingshuttle.projects.HotelBookingAndManagement.entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ProfileUpdateRequestDto {
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
}
