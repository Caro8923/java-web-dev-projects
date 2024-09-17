package org.launchcode;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String restaurantName;
    private String gratuities;
    private Date lastUpdated = new Date();
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu(String restaurantName, String gratuities) {
        this.restaurantName = restaurantName;
        this.gratuities = gratuities;
        this.lastUpdated = new Date();
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItems(MenuItem newItem) {
        //set all existing menu items to not new
        this.menuItems.forEach((item) -> item.setNew(false));

        //mark the new menu item as new
        newItem.setNew(true);

        //add new menu item
        this.menuItems.add(newItem);

        //update date
        this.lastUpdated = new Date();

    }

    // removes menu item by comparing to each item in arraylist
    public void removeMenuItem(MenuItem itemToRemove) {
        this.menuItems.remove(itemToRemove);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "restaurantName='" + restaurantName + '\'' +
                ", gratuities='" + gratuities + '\'' +
                ", lastUpdated=" + lastUpdated +
                ", menuItems=" + menuItems +
                '}';
    }
}


