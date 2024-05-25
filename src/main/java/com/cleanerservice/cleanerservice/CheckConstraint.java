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
@Table(name = "CHECK_CONSTRAINTS", schema = "INFORMATION_SCHEMA")
public class CheckConstraint {
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
    @Column(name = "CHECK_CLAUSE")
    private String checkClause;

}