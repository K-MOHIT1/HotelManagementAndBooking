package com.codingshuttle.projects.HotelBookingAndManagement.service;

import com.codingshuttle.projects.HotelBookingAndManagement.dto.*;
import com.codingshuttle.projects.HotelBookingAndManagement.entity.Room;
import org.springframework.data.domain.Page;

import java.util.List;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceResponseDto> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDto> getAllInventoryByRoom(Long roomId);

    void updateInventory(Long roomId, UpdateInventoryRequestDto updateInventoryRequestDto);
}
