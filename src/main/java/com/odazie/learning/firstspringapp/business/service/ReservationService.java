package com.odazie.learning.firstspringapp.business.service;

import com.odazie.learning.firstspringapp.business.domain.RoomReservation;
import com.odazie.learning.firstspringapp.data.entity.Guest;
import com.odazie.learning.firstspringapp.data.entity.Reservation;
import com.odazie.learning.firstspringapp.data.entity.Room;
import com.odazie.learning.firstspringapp.data.repository.GuestRepository;
import com.odazie.learning.firstspringapp.data.repository.ReservationRepository;
import com.odazie.learning.firstspringapp.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ReservationService {

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;


    @Autowired
    public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

//  ReservationService Object
    public List<RoomReservation> getRoomReservationsForDate(Date date){
        Iterable<Room> rooms = this.roomRepository.findAll();

        Map<Long, RoomReservation> roomReservationMap = new HashMap<>();

        rooms.forEach(room -> {
            RoomReservation roomReservation = new RoomReservation();
            roomReservation.setRoomId(room.getRoomId());
            roomReservation.setRoomName(room.getRoomName());
            roomReservation.setRoomNumber(room.getRoomNumber());

            roomReservationMap.put(room.getRoomId(),roomReservation);

        });

        Iterable<Reservation> reservations = this.reservationRepository.findReservationByReservationDate(new java.sql.Date(date.getTime()));
        reservations.forEach(reservation -> {
            RoomReservation roomReservation = roomReservationMap.get(reservation.getRoomId());
            roomReservation.setDate(date);
            Guest guest = this.guestRepository.findById(reservation.getGuestId()).get();
            roomReservation.setFirstName(guest.getFirstName());
            roomReservation.setLastName(guest.getLastName());
            roomReservation.setGuestId(guest.getGuestId());
        });

        //Convert to list.

        List<RoomReservation> roomReservations = new ArrayList<>();

        for (Long id: roomReservationMap.keySet()) {
            roomReservations.add(roomReservationMap.get(id));
        }

        roomReservations.sort(new Comparator<RoomReservation>() {
            @Override
            public int compare(RoomReservation o1, RoomReservation o2) {
                if(o1.getRoomName() == o2.getRoomName()){
                    return  o1.getRoomNumber().compareTo(o2.getRoomNumber());
                }
                return o1.getRoomName().compareTo(o2.getRoomName());
            }
        });

        return roomReservations;
    }

}
