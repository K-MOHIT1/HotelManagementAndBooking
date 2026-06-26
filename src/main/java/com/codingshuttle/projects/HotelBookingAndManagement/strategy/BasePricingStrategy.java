package com.codingshuttle.projects.HotelBookingAndManagement.strategy;

import com.codingshuttle.projects.HotelBookingAndManagement.entity.Inventory;

import java.math.BigDecimal;

public class BasePricingStrategy implements PricingStrategy{
    @Override
    public BigDecimal calculatePrice(Inventory inventory) {
        return inventory.getRoom().getBasePrice();
    }
}
