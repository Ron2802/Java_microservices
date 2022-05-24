package io.brains.MovieCatelogServices.resourse;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.brains.MovieCatelogServices.models.CatelogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatelogResourse {
	
	@RequestMapping("/{userId}")
	public List<CatelogItem> getcatelog(@PathVariable("userId") String userId){
		return Collections.singletonList(new CatelogItem("transformer", "test", 2));
		
	}

}
