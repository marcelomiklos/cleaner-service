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
@Table(name = "INDEX_COLUMNS", schema = "INFORMATION_SCHEMA")
public class IndexColumn {
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

    @Lob
    @Column(name = "ORDERING_SPECIFICATION")
    private String orderingSpecification;

    @Lob
    @Column(name = "NULL_ORDERING")
    private String nullOrdering;

    @Column(name = "IS_UNIQUE")
    private Boolean isUnique;

}