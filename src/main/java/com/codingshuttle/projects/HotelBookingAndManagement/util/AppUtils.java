package com.codingshuttle.projects.HotelBookingAndManagement.util;

import com.codingshuttle.projects.HotelBookingAndManagement.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class AppUtils {

    public static User getCurrentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
