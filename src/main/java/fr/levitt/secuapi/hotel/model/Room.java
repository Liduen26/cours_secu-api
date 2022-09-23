package fr.levitt.secuapi.hotel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rooms")
public class Room {

    @Id
    @GeneratedValue
    private int number;

    private int capacity;

    private int price;

    private RoomType type;

    public Room() {}

    public Room(RoomType type) {
        this.capacity = type.getSize();
        this.price = type.getPrice();
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public RoomType getType() {
        return type;
    }
    public void setType(RoomType type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return this.getType().name() + "{number: " + this.number + ", capacity: " + this.capacity + ", price: " + this.price + "}";
    }
}
