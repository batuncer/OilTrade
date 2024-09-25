package com.baki.oiltrade.application.services;

import com.baki.oiltrade.core.domain.valueobjects.ReportType;

public class ReportService {
	
	public void generateReport(ReportType reportType) {
        switch (reportType) {
            case PDF:
                // PDF report logic
                System.out.println("Generating PDF report...");
                break;
            case XML:
                // XML report logic
                System.out.println("Generating XML report...");
                break;
            default:
                throw new IllegalArgumentException("Unsupported report type: " + reportType);
        }
    }

}
