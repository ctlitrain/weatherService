package ctl.weatherService.io.weatherService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
	
	@GetMapping("/api/weather/forcast/{city}/{country}")
	public String getWeatherInfo(@PathVariable("city") String city,@PathVariable("country") String country) {
		
		//Your Code Goes Here.
		
		return "return the weather info as json/string";
	}

}
