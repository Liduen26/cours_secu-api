package fr.levitt.secuapi.hotel.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.levitt.secuapi.hotel.model.Room;
import fr.levitt.secuapi.hotel.model.RoomType;
import fr.levitt.secuapi.hotel.sql.RoomRepository;

@RestController
public class HotelController {
    
    @Autowired
    private RoomRepository roomRepo;


    @GetMapping("hotel/rooms")
    public Iterable getRooms() {    
        return roomRepo.findAll();
    }
    @GetMapping("hotel/room/{id}")
    public Optional<Room> getRooms(@PathVariable int id) {    
        return roomRepo.findById(id);
    }

    @PostMapping("hotel/add_room/{type}")
    public void add_room(@PathVariable int type) {
        switch (type) {
            case 1:
                roomRepo.save(new Room(RoomType.KINGSIZE));
                break;
            case 2:
                roomRepo.save(new Room(RoomType.LUXE));
                break;
            default:
                roomRepo.save(new Room(RoomType.STANDARD));
        }
    }
}
