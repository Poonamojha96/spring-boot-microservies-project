package io.poonam.ratingsdataservice;

import io.poonam.ratingsdataservice.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsData")
public class RatingsDataServiceController {

    @RequestMapping("{movieId}")
    public Rating getRating(@PathVariable("movieId")String movieId){
        return new Rating(movieId,3);
    }
}
