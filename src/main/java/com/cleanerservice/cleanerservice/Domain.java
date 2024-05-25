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
@Table(name = "DOMAINS", schema = "INFORMATION_SCHEMA")
public class Domain {
    @Lob
    @Column(name = "DOMAIN_CATALOG")
    private String domainCatalog;

    @Lob
    @Column(name = "DOMAIN_SCHEMA")
    private String domainSchema;

    @Lob
    @Column(name = "DOMAIN_NAME")
    private String domainName;

    @Lob
    @Column(name = "DATA_TYPE")
    private String dataType;

    @Column(name = "CHARACTER_MAXIMUM_LENGTH")
    private Long characterMaximumLength;

    @Column(name = "CHARACTER_OCTET_LENGTH")
    private Long characterOctetLength;

    @Lob
    @Column(name = "CHARACTER_SET_CATALOG")
    private String characterSetCatalog;

    @Lob
    @Column(name = "CHARACTER_SET_SCHEMA")
    private String characterSetSchema;

    @Lob
    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;

    @Lob
    @Column(name = "COLLATION_CATALOG")
    private String collationCatalog;

    @Lob
    @Column(name = "COLLATION_SCHEMA")
    private String collationSchema;

    @Lob
    @Column(name = "COLLATION_NAME")
    private String collationName;

    @Column(name = "NUMERIC_PRECISION")
    private Integer numericPrecision;

    @Column(name = "NUMERIC_PRECISION_RADIX")
    private Integer numericPrecisionRadix;

    @Column(name = "NUMERIC_SCALE")
    private Integer numericScale;

    @Column(name = "DATETIME_PRECISION")
    private Integer datetimePrecision;

    @Lob
    @Column(name = "INTERVAL_TYPE")
    private String intervalType;

    @Column(name = "INTERVAL_PRECISION")
    private Integer intervalPrecision;

    @Lob
    @Column(name = "DOMAIN_DEFAULT")
    private String domainDefault;

    @Column(name = "MAXIMUM_CARDINALITY")
    private Integer maximumCardinality;

    @Lob
    @Column(name = "DTD_IDENTIFIER")
    private String dtdIdentifier;

    @Lob
    @Column(name = "DECLARED_DATA_TYPE")
    private String declaredDataType;

    @Column(name = "DECLARED_NUMERIC_PRECISION")
    private Integer declaredNumericPrecision;

    @Column(name = "DECLARED_NUMERIC_SCALE")
    private Integer declaredNumericScale;

    @Lob
    @Column(name = "GEOMETRY_TYPE")
    private String geometryType;

    @Column(name = "GEOMETRY_SRID")
    private Integer geometrySrid;

    @Lob
    @Column(name = "DOMAIN_ON_UPDATE")
    private String domainOnUpdate;

    @Lob
    @Column(name = "PARENT_DOMAIN_CATALOG")
    private String parentDomainCatalog;

    @Lob
    @Column(name = "PARENT_DOMAIN_SCHEMA")
    private String parentDomainSchema;

    @Lob
    @Column(name = "PARENT_DOMAIN_NAME")
    private String parentDomainName;

    @Lob
    @Column(name = "REMARKS")
    private String remarks;

}