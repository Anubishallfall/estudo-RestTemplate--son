package com.hortfruitonline.hortfruitonline;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/geocodespace")
public class GeoCodeSpaceController {
	@Autowired
	ServiceTeste serviceTeste;
	
	
	@GetMapping("")
	public Object index() throws Exception {
	return serviceTeste.requestLocalizacao();
	}

		
}
