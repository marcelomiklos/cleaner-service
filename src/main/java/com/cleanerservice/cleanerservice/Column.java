package com.cleanerservice.cleanerservice;

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
@Table(name = "COLUMNS", schema = "INFORMATION_SCHEMA")
public class Column {
    @Lob
    @jakarta.persistence.Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    @Lob
    @jakarta.persistence.Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Lob
    @jakarta.persistence.Column(name = "TABLE_NAME")
    private String tableName;

    @Lob
    @jakarta.persistence.Column(name = "COLUMN_NAME")
    private String columnName;

    @jakarta.persistence.Column(name = "ORDINAL_POSITION")
    private Integer ordinalPosition;

    @Lob
    @jakarta.persistence.Column(name = "COLUMN_DEFAULT")
    private String columnDefault;

    @Lob
    @jakarta.persistence.Column(name = "IS_NULLABLE")
    private String isNullable;

    @Lob
    @jakarta.persistence.Column(name = "DATA_TYPE")
    private String dataType;

    @jakarta.persistence.Column(name = "CHARACTER_MAXIMUM_LENGTH")
    private Long characterMaximumLength;

    @jakarta.persistence.Column(name = "CHARACTER_OCTET_LENGTH")
    private Long characterOctetLength;

    @jakarta.persistence.Column(name = "NUMERIC_PRECISION")
    private Integer numericPrecision;

    @jakarta.persistence.Column(name = "NUMERIC_PRECISION_RADIX")
    private Integer numericPrecisionRadix;

    @jakarta.persistence.Column(name = "NUMERIC_SCALE")
    private Integer numericScale;

    @jakarta.persistence.Column(name = "DATETIME_PRECISION")
    private Integer datetimePrecision;

    @Lob
    @jakarta.persistence.Column(name = "INTERVAL_TYPE")
    private String intervalType;

    @jakarta.persistence.Column(name = "INTERVAL_PRECISION")
    private Integer intervalPrecision;

    @Lob
    @jakarta.persistence.Column(name = "CHARACTER_SET_CATALOG")
    private String characterSetCatalog;

    @Lob
    @jakarta.persistence.Column(name = "CHARACTER_SET_SCHEMA")
    private String characterSetSchema;

    @Lob
    @jakarta.persistence.Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;

    @Lob
    @jakarta.persistence.Column(name = "COLLATION_CATALOG")
    private String collationCatalog;

    @Lob
    @jakarta.persistence.Column(name = "COLLATION_SCHEMA")
    private String collationSchema;

    @Lob
    @jakarta.persistence.Column(name = "COLLATION_NAME")
    private String collationName;

    @Lob
    @jakarta.persistence.Column(name = "DOMAIN_CATALOG")
    private String domainCatalog;

    @Lob
    @jakarta.persistence.Column(name = "DOMAIN_SCHEMA")
    private String domainSchema;

    @Lob
    @jakarta.persistence.Column(name = "DOMAIN_NAME")
    private String domainName;

    @jakarta.persistence.Column(name = "MAXIMUM_CARDINALITY")
    private Integer maximumCardinality;

    @Lob
    @jakarta.persistence.Column(name = "DTD_IDENTIFIER")
    private String dtdIdentifier;

    @Lob
    @jakarta.persistence.Column(name = "IS_IDENTITY")
    private String isIdentity;

    @Lob
    @jakarta.persistence.Column(name = "IDENTITY_GENERATION")
    private String identityGeneration;

    @jakarta.persistence.Column(name = "IDENTITY_START")
    private Long identityStart;

    @jakarta.persistence.Column(name = "IDENTITY_INCREMENT")
    private Long identityIncrement;

    @jakarta.persistence.Column(name = "IDENTITY_MAXIMUM")
    private Long identityMaximum;

    @jakarta.persistence.Column(name = "IDENTITY_MINIMUM")
    private Long identityMinimum;

    @Lob
    @jakarta.persistence.Column(name = "IDENTITY_CYCLE")
    private String identityCycle;

    @Lob
    @jakarta.persistence.Column(name = "IS_GENERATED")
    private String isGenerated;

    @Lob
    @jakarta.persistence.Column(name = "GENERATION_EXPRESSION")
    private String generationExpression;

    @Lob
    @jakarta.persistence.Column(name = "DECLARED_DATA_TYPE")
    private String declaredDataType;

    @jakarta.persistence.Column(name = "DECLARED_NUMERIC_PRECISION")
    private Integer declaredNumericPrecision;

    @jakarta.persistence.Column(name = "DECLARED_NUMERIC_SCALE")
    private Integer declaredNumericScale;

    @Lob
    @jakarta.persistence.Column(name = "GEOMETRY_TYPE")
    private String geometryType;

    @jakarta.persistence.Column(name = "GEOMETRY_SRID")
    private Integer geometrySrid;

    @jakarta.persistence.Column(name = "IDENTITY_BASE")
    private Long identityBase;

    @jakarta.persistence.Column(name = "IDENTITY_CACHE")
    private Long identityCache;

    @Lob
    @jakarta.persistence.Column(name = "COLUMN_ON_UPDATE")
    private String columnOnUpdate;

    @jakarta.persistence.Column(name = "IS_VISIBLE")
    private Boolean isVisible;

    @jakarta.persistence.Column(name = "DEFAULT_ON_NULL")
    private Boolean defaultOnNull;

    @jakarta.persistence.Column(name = "SELECTIVITY")
    private Integer selectivity;

    @Lob
    @jakarta.persistence.Column(name = "REMARKS")
    private String remarks;

}