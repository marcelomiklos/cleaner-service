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
@Table(name = "KEY_COLUMN_USAGE", schema = "INFORMATION_SCHEMA")
public class KeyColumnUsage {
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
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    @Lob
    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Lob
    @Column(name = "TABLE_NAME")
    private String tableName;

    @Lob
    @Column(name = "COLUMN_NAME")
    private String columnName;

    @Column(name = "ORDINAL_POSITION")
    private Integer ordinalPosition;

    @Column(name = "POSITION_IN_UNIQUE_CONSTRAINT")
    private Integer positionInUniqueConstraint;

}