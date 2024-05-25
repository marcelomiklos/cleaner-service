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
@Table(name = "SESSION_STATE", schema = "INFORMATION_SCHEMA")
public class SessionState {
    @Lob
    @Column(name = "STATE_KEY")
    private String stateKey;

    @Lob
    @Column(name = "STATE_COMMAND")
    private String stateCommand;

}