package com.user.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.IndicomAirlines;
import com.user.service.AirlineServiceInterface;

@RestController
public class AirlineController {

	@Autowired
	private AirlineServiceInterface airlineRepo;
	@PostMapping("/bookticket")
	public IndicomAirlines bookTicket(@RequestBody IndicomAirlines indicomairlines)
	{
		return airlineRepo.saveTicket(indicomairlines);
	}
}
