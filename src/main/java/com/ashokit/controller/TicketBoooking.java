package com.ashokit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.PassengerInfo;
import com.ashokit.binding.TicketInfo;

@RestController
public class TicketBoooking {
	@PostMapping("ticketbook")
	public ResponseEntity<TicketInfo> bookticket(@RequestBody PassengerInfo psg) {
		TicketInfo ticket = new TicketInfo();
		ticket.setName(psg.getFname() + psg.getLname());
		ticket.setFrom(psg.getFrom());
		ticket.setTo(psg.getTo());
		ticket.setTicketstatus("CONFORM");
		ticket.setTicketprice("555757.67INR");
		ticket.setJournydate(psg.getJournyDate());

		return new ResponseEntity<>(ticket, HttpStatus.CREATED);

	}
}
