package com.codingshuttle.projects.HotelBookingAndManagement.service;

import com.codingshuttle.projects.HotelBookingAndManagement.dto.BookingDto;
import com.codingshuttle.projects.HotelBookingAndManagement.dto.BookingRequest;
import com.codingshuttle.projects.HotelBookingAndManagement.dto.HotelReportDto;
import com.codingshuttle.projects.HotelBookingAndManagement.entity.enums.BookingStatus;
import com.stripe.model.Event;

import java.time.LocalDate;
import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<Long> guestIdList);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    BookingStatus getBookingStatus(Long bookingId);

    List<BookingDto> getAllBookingsByHotelId(Long hotelId);

    HotelReportDto getHotelReport(Long hotelId, LocalDate startDate, LocalDate endDate);

    List<BookingDto> getMyBookings();
}
