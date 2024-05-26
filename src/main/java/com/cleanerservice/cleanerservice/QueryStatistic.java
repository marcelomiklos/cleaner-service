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
@Table(name = "QUERY_STATISTICS", schema = "INFORMATION_SCHEMA")
public class QueryStatistic {
    @Lob
    @Column(name = "SQL_STATEMENT")
    private String sqlStatement;

    @Column(name = "EXECUTION_COUNT")
    private Integer executionCount;

    @Column(name = "MIN_EXECUTION_TIME")
    private Double minExecutionTime;

    @Column(name = "MAX_EXECUTION_TIME")
    private Double maxExecutionTime;

    @Column(name = "CUMULATIVE_EXECUTION_TIME")
    private Double cumulativeExecutionTime;

    @Column(name = "AVERAGE_EXECUTION_TIME")
    private Double averageExecutionTime;

    @Column(name = "STD_DEV_EXECUTION_TIME")
    private Double stdDevExecutionTime;

    @Column(name = "MIN_ROW_COUNT")
    private Long minRowCount;

    @Column(name = "MAX_ROW_COUNT")
    private Long maxRowCount;

    @Column(name = "CUMULATIVE_ROW_COUNT")
    private Long cumulativeRowCount;

    @Column(name = "AVERAGE_ROW_COUNT")
    private Double averageRowCount;

    @Column(name = "STD_DEV_ROW_COUNT")
    private Double stdDevRowCount;

}