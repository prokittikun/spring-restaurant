package ku.cs.restaurant.controller;

import ku.cs.restaurant.entity.Restaurant;
import ku.cs.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurant")
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getRestaurant();
    }

    @PostMapping("/restaurant")
    public Restaurant create(@RequestBody Restaurant restaurant) {
        return restaurantService.create(restaurant);
    }


}
