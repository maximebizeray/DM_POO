package com.ensim.tp5.controller;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.ensim.tp5.model.DarkSky;
import com.ensim.tp5.model.Quote;

public class MeteoController {

	@PostMapping("/meteo")
    public String AfficheResultatformulaire(@RequestBody String adress,Model model) {
		SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
		RestTemplate restTemplate = new RestTemplate(clientHttpReq);
		Quote res = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="+adress, Quote.class);
		double lon = res.getFeatures().get(0).getGeometry().getCoordinates().get(0);
		double lat = res.getFeatures().get(0).getGeometry().getCoordinates().get(1);
		DarkSky s = restTemplate.getForObject("https://api.darksky.net/forecast/7576e13c0f93e7d4e7c7ebd354a9c876/"+lat+","+lon+"?lang=fr&exclude=hourly&exclude=daily&exclude=flags&units=si", DarkSky.class);	
		model.addAttribute("meteo",s);
		model.addAttribute("adresse",res.getFeatures().get(0).getProperties().getContext());
		model.addAttribute("ville",res.getFeatures().get(0).getProperties().getCity());
		return "Meteo";
    }
}
