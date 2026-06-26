package com.codingshuttle.projects.HotelBookingAndManagement.service;

import com.codingshuttle.projects.HotelBookingAndManagement.dto.ProfileUpdateRequestDto;
import com.codingshuttle.projects.HotelBookingAndManagement.dto.UserDto;
import com.codingshuttle.projects.HotelBookingAndManagement.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
