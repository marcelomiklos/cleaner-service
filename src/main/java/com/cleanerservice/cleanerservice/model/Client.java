package com.cleanerservice.cleanerservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@Table(name = "client")
@Setter
@Getter
@ToString
public class Client extends Task{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String cpf;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private  LocalDateTime updatedAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "emp_workstation",
            joinColumns =
                    { @JoinColumn(name = "client_id", referencedColumnName = "client_id") },
            inverseJoinColumns =
                    { @JoinColumn(name = "client_id", referencedColumnName = "client_id") })
    private Task task;

}