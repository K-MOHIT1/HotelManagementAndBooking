package com.codingshuttle.projects.HotelBookingAndManagement.strategy;

import com.codingshuttle.projects.HotelBookingAndManagement.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
