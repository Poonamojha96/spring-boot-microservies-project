package io.poonam.moviecatalogservice;

import io.poonam.moviecatalogservice.model.CatalogItem;
import io.poonam.moviecatalogservice.model.Movie;
import io.poonam.moviecatalogservice.model.UserRatings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogServiceController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        UserRatings userRatings=restTemplate.getForObject("http://localhost:8082/ratingsData/users/"+userId, UserRatings.class);
       return userRatings.getUserRatings().stream().map(rating -> {
            Movie movie= restTemplate.getForObject("http://localhost:8081/movies/"+rating.getMovieId(), Movie.class);
            return new CatalogItem(movie.getName(),rating.getRating(),"Desc");
        }).collect(Collectors.toList());
    }
}
