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
@Table(name = "ROLES", schema = "INFORMATION_SCHEMA")
public class Role {
    @Lob
    @Column(name = "ROLE_NAME")
    private String roleName;

    @Lob
    @Column(name = "REMARKS")
    private String remarks;

}