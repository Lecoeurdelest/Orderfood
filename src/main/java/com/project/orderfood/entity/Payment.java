package com.project.orderfood.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private Order order;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "payment_date")
    private Instant paymentDate;

    @Column(name = "amount", precision = 10, scale = 2)
    private BigDecimal amount;

}