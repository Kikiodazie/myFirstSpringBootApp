package com.odazie.learning.firstspringapp.data.repository;

import com.odazie.learning.firstspringapp.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    // Get  the reservation by date.
    Iterable<Reservation> findReservationByReservationDate(Date date);

}
