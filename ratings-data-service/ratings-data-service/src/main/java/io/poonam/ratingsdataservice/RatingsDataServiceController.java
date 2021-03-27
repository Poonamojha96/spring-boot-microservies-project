package io.poonam.ratingsdataservice;

import io.poonam.ratingsdataservice.model.Rating;
import io.poonam.ratingsdataservice.model.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/ratingsData")
public class RatingsDataServiceController {

    @RequestMapping("{movieId}")
    public Rating getRating(@PathVariable("movieId")String movieId){
        return new Rating(movieId,3);
    }

    @RequestMapping("users/{userId}")
    public UserRatings getUserRating(@PathVariable("userId")String movieId){
        return new UserRatings(Arrays.asList(new Rating("1234",3),
                new Rating("5678",5)));
    }
}
