package pl.mac.moviecatalogservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mac.moviecatalogservice.models.CatalogItem;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResuorce {

    //userId is a variable taking as the parameter
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        return Collections.singletonList(new CatalogItem("Transformers", "Action movie", 6));

    }

}
