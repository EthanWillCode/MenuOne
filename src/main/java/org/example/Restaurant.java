package org.example;

public class Restaurant {
    String name;
    Menu restaurantMenu;

    public Restaurant(String aName){
        this.name = aName;
    }

    public Menu getRestaurantMenu() {
        return restaurantMenu;
    }

    public void setRestaurantMenu(Menu restaurantMenu) {
        this.restaurantMenu = restaurantMenu;
    }
}
