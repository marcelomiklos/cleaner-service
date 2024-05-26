package com.cleanerservice.cleanerservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
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
@jakarta.persistence.Table(name = "TABLES", schema = "INFORMATION_SCHEMA")
public class Table {
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
    @Column(name = "TABLE_TYPE")
    private String tableType;

    @Lob
    @Column(name = "IS_INSERTABLE_INTO")
    private String isInsertableInto;

    @Lob
    @Column(name = "COMMIT_ACTION")
    private String commitAction;

    @Lob
    @Column(name = "STORAGE_TYPE")
    private String storageType;

    @Lob
    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "LAST_MODIFICATION")
    private Long lastModification;

    @Lob
    @Column(name = "TABLE_CLASS")
    private String tableClass;

    @Column(name = "ROW_COUNT_ESTIMATE")
    private Long rowCountEstimate;

}