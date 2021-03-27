package io.poonam.moviecatalogservice.model;

import java.util.List;

public class UserRatings {
    private List<Rating> userRatings;

    public UserRatings() {
    }

    public UserRatings(List<Rating> userRatings) {
        this.userRatings = userRatings;
    }

    public List<Rating> getUserRatings() {
        return userRatings;
    }

    public void setUserRatings(List<Rating> userRatings) {
        this.userRatings = userRatings;
    }
}
