package com.codingshuttle.projects.HotelBookingAndManagement.repository;

import com.codingshuttle.projects.HotelBookingAndManagement.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
