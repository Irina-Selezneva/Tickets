package ru.netology.Tickets;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String from;
    private String to;
    private int flightTime;

    public Ticket(int id, int price, String from, String to, int flightTime) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
        this.flightTime = flightTime;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getFlightTime() {
        return flightTime;
    }

    public int compareTo(Ticket o) {
        if (price < o.getPrice()) {
            return -1;
        }
        if (price > o.getPrice()) {
            return 1;
        }
        return 0;

    }
}
