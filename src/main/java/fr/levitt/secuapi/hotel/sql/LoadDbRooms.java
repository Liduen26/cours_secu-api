package fr.levitt.secuapi.hotel.sql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.levitt.secuapi.hotel.model.Room;
import fr.levitt.secuapi.hotel.model.RoomType;

@Configuration
public class LoadDbRooms {

    private static final Logger log = LoggerFactory.getLogger(LoadDbRooms.class);

    @Bean
    CommandLineRunner initDb(RoomRepository repo) {

        return args -> {
            log.info("Insert : " + repo.save(new Room(RoomType.STANDARD)));
            log.info("Insert : " + repo.save(new Room(RoomType.STANDARD)));
            log.info("Insert : " + repo.save(new Room(RoomType.STANDARD)));
            log.info("Insert : " + repo.save(new Room(RoomType.STANDARD)));
            log.info("Insert : " + repo.save(new Room(RoomType.KINGSIZE)));
            log.info("Insert : " + repo.save(new Room(RoomType.KINGSIZE)));
            log.info("Insert : " + repo.save(new Room(RoomType.LUXE)));
        };
    }
}
