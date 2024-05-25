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
@Table(name = "INFORMATION_SCHEMA_CATALOG_NAME", schema = "INFORMATION_SCHEMA")
public class InformationSchemaCatalogName {
    @Lob
    @Column(name = "CATALOG_NAME")
    private String catalogName;

    //TODO [Reverse Engineering] generate columns from DB
}