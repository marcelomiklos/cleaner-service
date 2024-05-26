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
@Table(name = "INDEXES", schema = "INFORMATION_SCHEMA")
public class Index {
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
    @Column(name = "INDEX_TYPE_NAME")
    private String indexTypeName;

    @Lob
    @Column(name = "NULLS_DISTINCT")
    private String nullsDistinct;

    @Column(name = "IS_GENERATED")
    private Boolean isGenerated;

    @Lob
    @Column(name = "REMARKS")
    private String remarks;

    @Lob
    @Column(name = "INDEX_CLASS")
    private String indexClass;

}