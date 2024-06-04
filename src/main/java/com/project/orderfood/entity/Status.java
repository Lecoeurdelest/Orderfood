package com.project.orderfood.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "status")
public class Status {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", length = 10)
    private String name;

}