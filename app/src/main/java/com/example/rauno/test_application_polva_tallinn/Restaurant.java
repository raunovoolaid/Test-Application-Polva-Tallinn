package com.example.rauno.test_application_polva_tallinn;

/**
 * Created by rauno on 09.12.2016. Created new class because Object-oriented programming.
 */

public class Restaurant {
    private static String restaurantName;
    private static int facebookLikes;

    public static String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public static int getFacebookLikes() {
        return facebookLikes;
    }

    public void setFacebookLikes(int facebookLikes) {
        this.facebookLikes = facebookLikes;
    }
}
