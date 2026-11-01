package com.rubenmoya.reservas_service.reservation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String customerName;

    @Column(nullable = false)
    private String customerEmail;

    @Column(nullable = false)
    private int partySize;

    @Column(nullable = false)
    private LocalDateTime reservationTime;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ReservationStatus status = ReservationStatus.PENDING;

    protected Reservation() {
        // required by JPA
    }

    public Reservation(String customerName, String customerEmail, int partySize, LocalDateTime reservationTime) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.partySize = partySize;
        this.reservationTime = reservationTime;
    }

    public Long getId() { return id; }
    public String getCustomerName() { return customerName; }
    public String getCustomerEmail() { return customerEmail; }
    public int getPartySize() { return partySize; }
    public LocalDateTime getReservationTime() { return reservationTime; }
    public ReservationStatus getStatus() { return status; }
}