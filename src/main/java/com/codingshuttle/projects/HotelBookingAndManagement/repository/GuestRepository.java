package com.codingshuttle.projects.HotelBookingAndManagement.repository;

import com.codingshuttle.projects.HotelBookingAndManagement.entity.Guest;
import com.codingshuttle.projects.HotelBookingAndManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}