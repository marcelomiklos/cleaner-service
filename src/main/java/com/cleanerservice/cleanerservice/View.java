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
@Table(name = "VIEWS", schema = "INFORMATION_SCHEMA")
public class View {
    @Lob
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    @Lob
    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Lob
    @Column(name = "TABLE_NAME")
    private String tableName;

    @Lob
    @Column(name = "VIEW_DEFINITION")
    private String viewDefinition;

    @Lob
    @Column(name = "CHECK_OPTION")
    private String checkOption;

    @Lob
    @Column(name = "IS_UPDATABLE")
    private String isUpdatable;

    @Lob
    @Column(name = "INSERTABLE_INTO")
    private String insertableInto;

    @Lob
    @Column(name = "IS_TRIGGER_UPDATABLE")
    private String isTriggerUpdatable;

    @Lob
    @Column(name = "IS_TRIGGER_DELETABLE")
    private String isTriggerDeletable;

    @Lob
    @Column(name = "IS_TRIGGER_INSERTABLE_INTO")
    private String isTriggerInsertableInto;

    @Lob
    @Column(name = "STATUS")
    private String status;

    @Lob
    @Column(name = "REMARKS")
    private String remarks;

}