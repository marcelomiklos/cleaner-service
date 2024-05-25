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
@Table(name = "SEQUENCES", schema = "INFORMATION_SCHEMA")
public class Sequence {
    @Lob
    @Column(name = "SEQUENCE_CATALOG")
    private String sequenceCatalog;

    @Lob
    @Column(name = "SEQUENCE_SCHEMA")
    private String sequenceSchema;

    @Lob
    @Column(name = "SEQUENCE_NAME")
    private String sequenceName;

    @Lob
    @Column(name = "DATA_TYPE")
    private String dataType;

    @Column(name = "NUMERIC_PRECISION")
    private Integer numericPrecision;

    @Column(name = "NUMERIC_PRECISION_RADIX")
    private Integer numericPrecisionRadix;

    @Column(name = "NUMERIC_SCALE")
    private Integer numericScale;

    @Column(name = "START_VALUE")
    private Long startValue;

    @Column(name = "MINIMUM_VALUE")
    private Long minimumValue;

    @Column(name = "MAXIMUM_VALUE")
    private Long maximumValue;

    @Column(name = "INCREMENT")
    private Long increment;

    @Lob
    @Column(name = "CYCLE_OPTION")
    private String cycleOption;

    @Lob
    @Column(name = "DECLARED_DATA_TYPE")
    private String declaredDataType;

    @Column(name = "DECLARED_NUMERIC_PRECISION")
    private Integer declaredNumericPrecision;

    @Column(name = "DECLARED_NUMERIC_SCALE")
    private Integer declaredNumericScale;

    @Column(name = "BASE_VALUE")
    private Long baseValue;

    @Column(name = "CACHE")
    private Long cache;

    @Lob
    @Column(name = "REMARKS")
    private String remarks;

}