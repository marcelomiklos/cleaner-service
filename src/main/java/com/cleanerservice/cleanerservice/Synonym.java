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
@Table(name = "SYNONYMS", schema = "INFORMATION_SCHEMA")
public class Synonym {
    @Lob
    @Column(name = "SYNONYM_CATALOG")
    private String synonymCatalog;

    @Lob
    @Column(name = "SYNONYM_SCHEMA")
    private String synonymSchema;

    @Lob
    @Column(name = "SYNONYM_NAME")
    private String synonymName;

    @Lob
    @Column(name = "SYNONYM_FOR")
    private String synonymFor;

    @Lob
    @Column(name = "SYNONYM_FOR_SCHEMA")
    private String synonymForSchema;

    @Lob
    @Column(name = "TYPE_NAME")
    private String typeName;

    @Lob
    @Column(name = "STATUS")
    private String status;

    @Lob
    @Column(name = "REMARKS")
    private String remarks;

}