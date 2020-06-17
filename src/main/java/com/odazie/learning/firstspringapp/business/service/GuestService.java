package com.odazie.learning.firstspringapp.business.service;

import com.odazie.learning.firstspringapp.business.domain.RoomGuest;
import com.odazie.learning.firstspringapp.data.entity.Guest;
import com.odazie.learning.firstspringapp.data.repository.GuestRepository;
import com.odazie.learning.firstspringapp.data.repository.ReservationRepository;
import com.odazie.learning.firstspringapp.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GuestService {

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    @Autowired
    public GuestService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    public List<RoomGuest> printAllGuestAlphabeticallyByLastName(){
        Iterable<Guest> guests = this.guestRepository.findAll();

        Map<Long, RoomGuest> roomGuestMap = new HashMap<>();

        guests.forEach(guest -> {
            RoomGuest roomGuest = new RoomGuest();
            roomGuest.setFirstName(guest.getFirstName());
            roomGuest.setGuestId(guest.getGuestId());
            roomGuest.setLastName(guest.getLastName());
            roomGuest.setAddress(guest.getAddress());
            roomGuest.setCountry(guest.getCountry());
            roomGuest.setEmailAddress(guest.getEmailAddress());
            roomGuest.setState(guest.getState());
            roomGuest.setPhoneNumber(guest.getPhoneNumber());

            roomGuestMap.put(guest.getGuestId(), roomGuest);
        });

        List<RoomGuest> roomGuests = new ArrayList<>();

        for (Long id : roomGuestMap.keySet()){
            roomGuests.add(roomGuestMap.get(id));
        }

        roomGuests.sort(new Comparator<RoomGuest>() {
            @Override
            public int compare(RoomGuest o1, RoomGuest o2) {
                if (o1.getLastName() == o2.getLastName()){
                    return  o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
                }
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        return roomGuests;
    }

}
