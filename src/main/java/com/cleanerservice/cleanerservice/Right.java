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
@Table(name = "RIGHTS", schema = "INFORMATION_SCHEMA")
public class Right {
    @Lob
    @Column(name = "GRANTEE")
    private String grantee;

    @Lob
    @Column(name = "GRANTEETYPE")
    private String granteetype;

    @Lob
    @Column(name = "GRANTEDROLE")
    private String grantedrole;

    @Lob
    @Column(name = "RIGHTS")
    private String rights;

    @Lob
    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Lob
    @Column(name = "TABLE_NAME")
    private String tableName;

}