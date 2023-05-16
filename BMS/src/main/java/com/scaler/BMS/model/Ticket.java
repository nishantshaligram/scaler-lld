package com.scaler.BMS.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Ticket extends BaseModel{
    private double totalAmount;
    private Date timeOfBooking;
    @ManyToOne
    private Show show;
    @OneToMany
    private List<ShowSeat> showSeats;
    @ManyToOne
    private User bookedBy;
    @OneToOne
    private Payment payment;

    // Add ticket Status -> if we want tot give option for ticket cancellation

}
