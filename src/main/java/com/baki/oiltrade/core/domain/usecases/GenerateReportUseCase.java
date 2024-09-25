package com.baki.oiltrade.core.domain.usecases;

import com.baki.oiltrade.application.services.ReportService;
import com.baki.oiltrade.core.domain.valueobjects.ReportType;

public class GenerateReportUseCase {
	
	private  ReportService reportService;

    public GenerateReportUseCase(ReportService reportService) {
        this.reportService = reportService;
    }

    public void execute(ReportType reportType) {
        // report create
        reportService.generateReport(reportType);
    }

}
