package com.odazie.learning.firstspringapp.web;


import com.odazie.learning.firstspringapp.business.domain.RoomReservation;
import com.odazie.learning.firstspringapp.business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/reservations")
public class RoomReservationWebServiceController {
    private final ReservationService reservationService;

    @Autowired
    public RoomReservationWebServiceController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
    // there is no Model parameter because this is not a web page but a service.
    @GetMapping
    public List<RoomReservation> getRoomReservations(@RequestParam(name = "date", required = false)String dateString){
        Date date = DateUtils.createDateFromDateString(dateString);

        return this.reservationService.getRoomReservationsForDate(date);

    }




}
