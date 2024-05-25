package com.cleanerservice.cleanerservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "TRIGGERS", schema = "INFORMATION_SCHEMA")
public class Trigger {
    @Lob
    @Column(name = "TRIGGER_CATALOG")
    private String triggerCatalog;

    @Lob
    @Column(name = "TRIGGER_SCHEMA")
    private String triggerSchema;

    @Lob
    @Column(name = "TRIGGER_NAME")
    private String triggerName;

    @Lob
    @Column(name = "EVENT_MANIPULATION")
    private String eventManipulation;

    @Lob
    @Column(name = "EVENT_OBJECT_CATALOG")
    private String eventObjectCatalog;

    @Lob
    @Column(name = "EVENT_OBJECT_SCHEMA")
    private String eventObjectSchema;

    @Lob
    @Column(name = "EVENT_OBJECT_TABLE")
    private String eventObjectTable;

    @Lob
    @Column(name = "ACTION_ORIENTATION")
    private String actionOrientation;

    @Lob
    @Column(name = "ACTION_TIMING")
    private String actionTiming;

    @Column(name = "IS_ROLLBACK")
    private Boolean isRollback;

    @Lob
    @Column(name = "JAVA_CLASS")
    private String javaClass;

    @Column(name = "QUEUE_SIZE")
    private Integer queueSize;

    @Column(name = "NO_WAIT")
    private Boolean noWait;

    @Lob
    @Column(name = "REMARKS")
    private String remarks;

}