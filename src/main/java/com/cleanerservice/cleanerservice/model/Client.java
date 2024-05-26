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
@Table(name = "client", indexes = {
        @Index(name = "idx_client_client_id_name_cpf", columnList = "client_id, name, cpf")
})
@Setter
@Getter
@ToString
public class Client {
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
    @JoinTable(name = "client",
            joinColumns =
                     { @JoinColumn(name = "client_id", referencedColumnName = "client_id") },
            inverseJoinColumns =
                    { @JoinColumn(name = "client_id", referencedColumnName = "client_id") })
      private Task task;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "client_id_tasks_client_id")
    private Client client_id_tasks;

    @ToString.Exclude
    @OneToOne(mappedBy = "client_id_tasks", cascade = CascadeType.MERGE, orphanRemoval = true)
    private Client client;

}