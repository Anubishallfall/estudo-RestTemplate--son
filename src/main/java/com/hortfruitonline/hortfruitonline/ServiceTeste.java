package com.hortfruitonline.hortfruitonline;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceTeste {

	
	public LocalizacaoDto requestLocalizacao() throws Exception{
		String uri = "http://api.open-notify.org/iss-now.json";
		RestTemplate restTemplate = new RestTemplate();
		LocalizacaoDto result = restTemplate.getForObject(uri, LocalizacaoDto.class);
		return result;
	}
	
	
	
	
}
