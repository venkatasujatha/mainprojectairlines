package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.IndicomAirlines;
import com.user.repository.AirlinesRepository;

@Service
public class AirlineServiceImpl implements AirlineServiceInterface{

	@Autowired
	private AirlinesRepository airlineRepo;
	@Override
	public IndicomAirlines saveTicket(IndicomAirlines ticket) {
		
		return airlineRepo.save(ticket);
	}

}
