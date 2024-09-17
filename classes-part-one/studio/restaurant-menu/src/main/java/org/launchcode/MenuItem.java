package org.launchcode;

public class MenuItem {
    String name;
    Double price;
    String description;
    String category;
    boolean isNew;

    public MenuItem(String name, Double price, String description, String category, boolean IsNew) {

        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;


}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean equals(MenuItem itemToCompare) {
        return this.description.equals(itemToCompare.description);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}