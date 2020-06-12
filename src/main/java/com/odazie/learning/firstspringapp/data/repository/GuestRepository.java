package com.odazie.learning.firstspringapp.data.repository;

import com.odazie.learning.firstspringapp.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {

}
