package com.Mohit.projects.hotelManagementAndBooking.entity;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class HotelContactInfo {

    private String address;

    private String phoneNo;

    private String email;

    private String location;



}
