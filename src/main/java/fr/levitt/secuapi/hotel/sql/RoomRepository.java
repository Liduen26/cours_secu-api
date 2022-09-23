package fr.levitt.secuapi.hotel.sql;

import org.springframework.data.repository.CrudRepository;

import fr.levitt.secuapi.hotel.model.Room;

public interface RoomRepository extends CrudRepository<Room, Integer>{
    
}
