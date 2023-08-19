import java.util.*;

class Reservation {
    private String reservationId;
    private String userName;
    private Date reservationDate;
    private int numberOfGuests;

    public Reservation(String userName, Date reservationDate, int numberOfGuests) {
        this.reservationId = UUID.randomUUID().toString();
        this.userName = userName;
        this.reservationDate = reservationDate;
        this.numberOfGuests = numberOfGuests;
    }

    // Getters and setters

    @Override
    public String toString() {
        return "Reservation ID: " + reservationId +
               "\nUser: " + userName +
               "\nDate: " + reservationDate +
               "\nNumber of Guests: " + numberOfGuests;
    }
}

class ReservationSystem {
    private List<Reservation> reservations;

    public ReservationSystem() {
        this.reservations = new ArrayList<>();
    }

    public void makeReservation(String userName, Date reservationDate, int numberOfGuests) {
        Reservation reservation = new Reservation(userName, reservationDate, numberOfGuests);
        reservations.add(reservation);
        System.out.println("Reservation made:\n" + reservation);
    }

    public void listReservations() {
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
            System.out.println("--------------------------");
        }
    }
}

public class p1 {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();

        // Making reservations
        reservationSystem.makeReservation("Alice", new Date(), 4);
        reservationSystem.makeReservation("Bob", new Date(), 2);

        // Listing reservations
        System.out.println("List of Reservations:");
        reservationSystem.listReservations();
    }
}
