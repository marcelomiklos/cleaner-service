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
@Table(name = "SETTINGS", schema = "INFORMATION_SCHEMA")
public class Setting {
    @Lob
    @Column(name = "SETTING_NAME")
    private String settingName;

    @Lob
    @Column(name = "SETTING_VALUE")
    private String settingValue;

}