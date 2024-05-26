package com.cleanerservice.cleanerservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "IN_DOUBT", schema = "INFORMATION_SCHEMA")
public class InDoubt {
    @Lob
    @Column(name = "TRANSACTION_NAME")
    private String transactionName;

    @Lob
    @Column(name = "TRANSACTION_STATE")
    private String transactionState;

}