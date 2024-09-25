package com.baki.oiltrade.core.domain.entities;

import java.time.LocalDate;

import com.baki.oiltrade.core.domain.valueobjects.ReportType;

public class Report {
	
	private Long id;
    private LocalDate reportDate;
    private String content;
    private ReportType reportType;

    // Constructor
    public Report(Long id, LocalDate reportDate, String content, ReportType reportType) {
        this.id = id;
        this.reportDate = reportDate;
        this.content = content;
        this.reportType = reportType;
    }

    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ReportType getReportType() {
        return reportType;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }

    // Additional Methods
    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", reportDate=" + reportDate +
                ", content='" + content + '\'' +
                ", reportType='" + reportType + '\'' +
                '}';
    }

}
