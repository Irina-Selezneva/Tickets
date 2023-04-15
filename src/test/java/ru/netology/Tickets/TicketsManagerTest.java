package ru.netology.Tickets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketsManagerTest {
    TicketRepository repo = new TicketRepository();
    TicketsManager manager = new TicketsManager(repo);

    @Test

    public void findTickets() {

        Ticket ticket1 = new Ticket(1, 250, "LED", "LCA", 60);
        Ticket ticket2 = new Ticket(2, 150, "LED", "LCA", 70);
        Ticket ticket3 = new Ticket(3, 250, "YVR", "LCA", 110);
        Ticket ticket4 = new Ticket(4, 450, "LCA", "LED", 90);
        Ticket ticket5 = new Ticket(5, 650, "LED", "YVR", 120);
        Ticket ticket6 = new Ticket(6, 350, "LED", "LCA", 100);
        Ticket ticket7 = new Ticket(7, 350, "YVR", "LED", 130);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket2, ticket1, ticket6};
        Ticket[] actual = manager.findAll("LED", "LCA");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void findOneTicket() {

        Ticket ticket1 = new Ticket(1, 250, "LED", "LCA", 60);
        Ticket ticket2 = new Ticket(2, 150, "LED", "LCA", 70);
        Ticket ticket3 = new Ticket(3, 250, "YVR", "LCA", 110);
        Ticket ticket4 = new Ticket(4, 450, "LCA", "LED", 90);
        Ticket ticket5 = new Ticket(5, 650, "LED", "YVR", 120);
        Ticket ticket6 = new Ticket(6, 350, "LED", "LCA", 100);
        Ticket ticket7 = new Ticket(7, 350, "YVR", "LED", 130);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket5};
        Ticket[] actual = manager.findAll("LED", "YVR");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findNoTickets() {

        Ticket ticket1 = new Ticket(1, 250, "LED", "LCA", 60);
        Ticket ticket2 = new Ticket(2, 150, "LED", "LCA", 70);
        Ticket ticket3 = new Ticket(3, 250, "YVR", "LCA", 110);
        Ticket ticket4 = new Ticket(4, 450, "LCA", "LED", 90);
        Ticket ticket5 = new Ticket(5, 650, "LED", "YVR", 120);
        Ticket ticket6 = new Ticket(6, 350, "LED", "LCA", 100);
        Ticket ticket7 = new Ticket(7, 350, "YVR", "LED", 130);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("LCA", "YVR");

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void findEqualPrice() {
        Ticket ticket1 = new Ticket(1, 250, "LED", "LCA", 70);
        Ticket ticket2 = new Ticket(2, 250, "LED", "LCA", 60);
        Ticket ticket3 = new Ticket(3, 250, "YVR", "LCA", 110);
        Ticket ticket4 = new Ticket(4, 450, "LCA", "LED", 90);
        Ticket ticket5 = new Ticket(5, 650, "LED", "YVR", 120);
        Ticket ticket6 = new Ticket(6, 350, "LED", "LCA", 100);
        Ticket ticket7 = new Ticket(7, 350, "YVR", "LED", 130);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket1, ticket2, ticket6};
        Ticket[] actual = manager.findAll("LED", "LCA");

        Assertions.assertArrayEquals(expected, actual);

    }

}
