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
@Table(name = "SCHEMATA", schema = "INFORMATION_SCHEMA")
public class Schemata {
    @Lob
    @Column(name = "CATALOG_NAME")
    private String catalogName;

    @Lob
    @Column(name = "SCHEMA_NAME")
    private String schemaName;

    @Lob
    @Column(name = "SCHEMA_OWNER")
    private String schemaOwner;

    @Lob
    @Column(name = "DEFAULT_CHARACTER_SET_CATALOG")
    private String defaultCharacterSetCatalog;

    @Lob
    @Column(name = "DEFAULT_CHARACTER_SET_SCHEMA")
    private String defaultCharacterSetSchema;

    @Lob
    @Column(name = "DEFAULT_CHARACTER_SET_NAME")
    private String defaultCharacterSetName;

    @Lob
    @Column(name = "SQL_PATH")
    private String sqlPath;

    @Lob
    @Column(name = "DEFAULT_COLLATION_NAME")
    private String defaultCollationName;

    @Lob
    @Column(name = "REMARKS")
    private String remarks;

}