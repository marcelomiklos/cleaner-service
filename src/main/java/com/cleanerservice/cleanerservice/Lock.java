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
@Table(name = "LOCKS", schema = "INFORMATION_SCHEMA")
public class Lock {
    @Lob
    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Lob
    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "SESSION_ID")
    private Integer sessionId;

    @Lob
    @Column(name = "LOCK_TYPE")
    private String lockType;

}