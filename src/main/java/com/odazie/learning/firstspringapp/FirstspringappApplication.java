package com.odazie.learning.firstspringapp;

import com.odazie.learning.firstspringapp.data.entity.Guest;
import com.odazie.learning.firstspringapp.data.entity.Reservation;
import com.odazie.learning.firstspringapp.data.entity.Room;
import com.odazie.learning.firstspringapp.data.repository.GuestRepository;
import com.odazie.learning.firstspringapp.data.repository.ReservationRepository;
import com.odazie.learning.firstspringapp.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FirstspringappApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstspringappApplication.class, args);
    }

//NOT A GOOD WAY TO BUILD CONTOROLLERS CHECK THE /WEB PACKAGE
//    @RestController
//    @RequestMapping("/rooms")
//    public class RoomController{
//        @Autowired
//        private RoomRepository roomRepository;
//
//        @GetMapping
//
//        public Iterable<Room> getRooms(){
//            return this.roomRepository.findAll();
//        }
//    }
//
//
//    @RestController
//    @RequestMapping("/guests")
//    public class GuestController{
//        @Autowired
//        private GuestRepository guestRepository;
//
//        @GetMapping
//        public Iterable<Guest> getGuests(){
//            return  this.guestRepository.findAll();
//        }
//    }
//
//    @RestController
//    @RequestMapping("/reservations")
//    public class ReservationsController{
//        @Autowired
//        private ReservationRepository reservationRepository;
//
//        @GetMapping
//        public Iterable<Reservation> getReservations(){
//            return this.reservationRepository.findAll();
//        }
//    }


}
