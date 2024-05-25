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
@Table(name = "ENUM_VALUES", schema = "INFORMATION_SCHEMA")
public class EnumValue {
    @Lob
    @Column(name = "OBJECT_CATALOG")
    private String objectCatalog;

    @Lob
    @Column(name = "OBJECT_SCHEMA")
    private String objectSchema;

    @Lob
    @Column(name = "OBJECT_NAME")
    private String objectName;

    @Lob
    @Column(name = "OBJECT_TYPE")
    private String objectType;

    @Lob
    @Column(name = "ENUM_IDENTIFIER")
    private String enumIdentifier;

    @Lob
    @Column(name = "VALUE_NAME")
    private String valueName;

    @Lob
    @Column(name = "VALUE_ORDINAL")
    private String valueOrdinal;

}