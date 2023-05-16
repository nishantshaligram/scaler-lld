package com.scaler.BMS.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Payment extends BaseModel{
    private double amount;
    private Date timeStamp;
    private String transactionNo;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @OneToOne
    private Ticket ticket;
}

// Relationship
// Payment : PaymentStatus -> M:1
// Payment : Ticket -> 1:1
