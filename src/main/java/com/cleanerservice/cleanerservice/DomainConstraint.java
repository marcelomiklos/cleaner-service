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
@Table(name = "DOMAIN_CONSTRAINTS", schema = "INFORMATION_SCHEMA")
public class DomainConstraint {
    @Lob
    @Column(name = "CONSTRAINT_CATALOG")
    private String constraintCatalog;

    @Lob
    @Column(name = "CONSTRAINT_SCHEMA")
    private String constraintSchema;

    @Lob
    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;

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
    @Column(name = "IS_DEFERRABLE")
    private String isDeferrable;

    @Lob
    @Column(name = "INITIALLY_DEFERRED")
    private String initiallyDeferred;

    @Lob
    @Column(name = "REMARKS")
    private String remarks;

}