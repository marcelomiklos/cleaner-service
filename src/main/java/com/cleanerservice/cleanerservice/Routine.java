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
@Table(name = "ROUTINES", schema = "INFORMATION_SCHEMA")
public class Routine {
    @Lob
    @Column(name = "SPECIFIC_CATALOG")
    private String specificCatalog;

    @Lob
    @Column(name = "SPECIFIC_SCHEMA")
    private String specificSchema;

    @Lob
    @Column(name = "SPECIFIC_NAME")
    private String specificName;

    @Lob
    @Column(name = "ROUTINE_CATALOG")
    private String routineCatalog;

    @Lob
    @Column(name = "ROUTINE_SCHEMA")
    private String routineSchema;

    @Lob
    @Column(name = "ROUTINE_NAME")
    private String routineName;

    @Lob
    @Column(name = "ROUTINE_TYPE")
    private String routineType;

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

    @Column(name = "MAXIMUM_CARDINALITY")
    private Integer maximumCardinality;

    @Lob
    @Column(name = "DTD_IDENTIFIER")
    private String dtdIdentifier;

    @Lob
    @Column(name = "ROUTINE_BODY")
    private String routineBody;

    @Lob
    @Column(name = "ROUTINE_DEFINITION")
    private String routineDefinition;

    @Lob
    @Column(name = "EXTERNAL_NAME")
    private String externalName;

    @Lob
    @Column(name = "EXTERNAL_LANGUAGE")
    private String externalLanguage;

    @Lob
    @Column(name = "PARAMETER_STYLE")
    private String parameterStyle;

    @Lob
    @Column(name = "IS_DETERMINISTIC")
    private String isDeterministic;

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
    @Column(name = "REMARKS")
    private String remarks;

}