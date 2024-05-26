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
@Table(name = "COLLATIONS", schema = "INFORMATION_SCHEMA")
public class Collation {
    @Lob
    @Column(name = "COLLATION_CATALOG")
    private String collationCatalog;

    @Lob
    @Column(name = "COLLATION_SCHEMA")
    private String collationSchema;

    @Lob
    @Column(name = "COLLATION_NAME")
    private String collationName;

    @Lob
    @Column(name = "PAD_ATTRIBUTE")
    private String padAttribute;

    @Lob
    @Column(name = "LANGUAGE_TAG")
    private String languageTag;

}