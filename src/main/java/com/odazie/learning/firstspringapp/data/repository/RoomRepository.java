package com.odazie.learning.firstspringapp.data.repository;

import com.odazie.learning.firstspringapp.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository <Room, Long>{

}
