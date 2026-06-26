package com.codingshuttle.projects.HotelBookingAndManagement.service;

import com.codingshuttle.projects.HotelBookingAndManagement.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
