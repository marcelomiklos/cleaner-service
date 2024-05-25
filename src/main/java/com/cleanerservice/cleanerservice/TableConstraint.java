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
@Table(name = "TABLE_CONSTRAINTS", schema = "INFORMATION_SCHEMA")
public class TableConstraint {
    @Lob
    @Column(name = "CONSTRAINT_CATALOG")
    private String constraintCatalog;

    @Lob
    @Column(name = "CONSTRAINT_SCHEMA")
    private String constraintSchema;

    @Lob
    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;

    @Lob
    @Column(name = "CONSTRAINT_TYPE")
    private String constraintType;

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
    @Column(name = "IS_DEFERRABLE")
    private String isDeferrable;

    @Lob
    @Column(name = "INITIALLY_DEFERRED")
    private String initiallyDeferred;

    @Lob
    @Column(name = "ENFORCED")
    private String enforced;

    @Lob
    @Column(name = "NULLS_DISTINCT")
    private String nullsDistinct;

    @Lob
    @Column(name = "INDEX_CATALOG")
    private String indexCatalog;

    @Lob
    @Column(name = "INDEX_SCHEMA")
    private String indexSchema;

    @Lob
    @Column(name = "INDEX_NAME")
    private String indexName;

    @Lob
    @Column(name = "REMARKS")
    private String remarks;

}