package com.project.restaurantlisting.service;

import com.project.restaurantlisting.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;


    public void findAllRestaurant() {
    }
}
