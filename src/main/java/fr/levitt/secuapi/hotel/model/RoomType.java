package fr.levitt.secuapi.hotel.model;

public enum RoomType {
    STANDARD(2, 60), 
    KINGSIZE(4, 100), 
    LUXE(6, 200);
    
    private int size;
    private int price;

    private RoomType(int size, int price) {
        this.size = size;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
