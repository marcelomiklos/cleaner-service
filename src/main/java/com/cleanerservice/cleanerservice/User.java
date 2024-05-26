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
@Table(name = "USERS", schema = "INFORMATION_SCHEMA")
public class User {
    @Lob
    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "IS_ADMIN")
    private Boolean isAdmin;

    @Lob
    @Column(name = "REMARKS")
    private String remarks;

}