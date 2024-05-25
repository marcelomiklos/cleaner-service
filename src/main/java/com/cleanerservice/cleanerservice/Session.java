package com.cleanerservice.cleanerservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "SESSIONS", schema = "INFORMATION_SCHEMA")
public class Session {
    @Column(name = "SESSION_ID")
    private Integer sessionId;

    @Lob
    @Column(name = "USER_NAME")
    private String userName;

    @Lob
    @Column(name = "SERVER")
    private String server;

    @Lob
    @Column(name = "CLIENT_ADDR")
    private String clientAddr;

    @Lob
    @Column(name = "CLIENT_INFO")
    private String clientInfo;

    @Column(name = "SESSION_START")
    private Instant sessionStart;

    @Lob
    @Column(name = "ISOLATION_LEVEL")
    private String isolationLevel;

    @Lob
    @Column(name = "EXECUTING_STATEMENT")
    private String executingStatement;

    @Column(name = "EXECUTING_STATEMENT_START")
    private Instant executingStatementStart;

    @Column(name = "CONTAINS_UNCOMMITTED")
    private Boolean containsUncommitted;

    @Lob
    @Column(name = "SESSION_STATE")
    private String sessionState;

    @Column(name = "BLOCKER_ID")
    private Integer blockerId;

    @Column(name = "SLEEP_SINCE")
    private Instant sleepSince;

}