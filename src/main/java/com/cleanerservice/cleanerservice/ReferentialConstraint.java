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
@Table(name = "REFERENTIAL_CONSTRAINTS", schema = "INFORMATION_SCHEMA")
public class ReferentialConstraint {
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
    @Column(name = "UNIQUE_CONSTRAINT_CATALOG")
    private String uniqueConstraintCatalog;

    @Lob
    @Column(name = "UNIQUE_CONSTRAINT_SCHEMA")
    private String uniqueConstraintSchema;

    @Lob
    @Column(name = "UNIQUE_CONSTRAINT_NAME")
    private String uniqueConstraintName;

    @Lob
    @Column(name = "MATCH_OPTION")
    private String matchOption;

    @Lob
    @Column(name = "UPDATE_RULE")
    private String updateRule;

    @Lob
    @Column(name = "DELETE_RULE")
    private String deleteRule;

}