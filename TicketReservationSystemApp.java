class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    Ticket head;
    
    public TicketReservationSystem() {
        this.head = null;
    }

    public void addTicket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            newTicket.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
    }

    public void removeTicket(int ticketId) {
        if (head == null) return;

        Ticket temp = head;
        Ticket prev = null;
        do {
            if (temp.ticketId == ticketId) {
                if (prev != null) {
                    prev.next = temp.next;
                } else {  // If removing the head node
                    if (head.next == head) {
                        head = null; // Only one node in the list
                    } else {
                        Ticket last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = temp.next;
                        last.next = head;
                    }
                }
                System.out.println("Ticket with ID " + ticketId + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Ticket not found.");
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets reserved.");
            return;
        }

        Ticket temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName + 
                               ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + 
                               ", Booking Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchTicketByCustomerName(String customerName) {
        if (head == null) {
            System.out.println("No tickets reserved.");
            return;
        }

        Ticket temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(customerName)) {
                System.out.println("Ticket ID: " + temp.ticketId + ", Movie: " + temp.movieName + 
                                   ", Seat: " + temp.seatNumber + ", Booking Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        
        if (!found) {
            System.out.println("No tickets found for customer: " + customerName);
        }
    }

    public void searchTicketByMovieName(String movieName) {
        if (head == null) {
            System.out.println("No tickets reserved.");
            return;
        }

        Ticket temp = head;
        boolean found = false;
        do {
            if (temp.movieName.equalsIgnoreCase(movieName)) {
                System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName + 
                                   ", Seat: " + temp.seatNumber + ", Booking Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        
        if (!found) {
            System.out.println("No tickets found for movie: " + movieName);
        }
    }

    public int getTotalBookedTickets() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        
        return count;
    }
}

public class TicketReservationSystemApp {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        
        system.addTicket(1, "Alice", "Avatar", 10, "2025-02-10 14:00");
        system.addTicket(2, "Bob", "Avengers", 5, "2025-02-10 15:00");
        system.addTicket(3, "Charlie", "Avatar", 15, "2025-02-10 16:00");

        system.displayTickets();

        System.out.println("\nSearching for tickets booked by Alice:");
        system.searchTicketByCustomerName("Alice");

        System.out.println("\nSearching for tickets for movie Avatar:");
        system.searchTicketByMovieName("Avatar");

        System.out.println("\nTotal tickets booked: " + system.getTotalBookedTickets());

        System.out.println("\nRemoving ticket with ID 2...");
        system.removeTicket(2);
        system.displayTickets();

        System.out.println("\nTotal tickets booked: " + system.getTotalBookedTickets());
    }
}
