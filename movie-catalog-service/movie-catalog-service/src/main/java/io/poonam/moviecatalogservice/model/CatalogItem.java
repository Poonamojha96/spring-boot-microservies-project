package io.poonam.moviecatalogservice.model;

public class CatalogItem {
    private String name;
    private int rating;
    private String desc;

    public CatalogItem(String name, int rating, String desc) {
        this.name = name;
        this.rating = rating;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
