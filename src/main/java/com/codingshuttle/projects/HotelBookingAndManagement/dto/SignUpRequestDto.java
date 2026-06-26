package com.codingshuttle.projects.HotelBookingAndManagement.dto;

import lombok.Data;

@Data
public class SignUpRequestDto {
    private String email;
    private String password;
    private String name;
}
