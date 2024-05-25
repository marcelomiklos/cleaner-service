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
@Table(name = "TABLE_PRIVILEGES", schema = "INFORMATION_SCHEMA")
public class TablePrivilege {
    @Lob
    @Column(name = "GRANTOR")
    private String grantor;

    @Lob
    @Column(name = "GRANTEE")
    private String grantee;

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
    @Column(name = "PRIVILEGE_TYPE")
    private String privilegeType;

    @Lob
    @Column(name = "IS_GRANTABLE")
    private String isGrantable;

    @Lob
    @Column(name = "WITH_HIERARCHY")
    private String withHierarchy;

}