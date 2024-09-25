package com.baki.oiltrade.core.domain.usecases;

import com.baki.oiltrade.application.services.ReportDistributionService;
import com.baki.oiltrade.core.domain.valueobjects.ReportType;

public class DistributeReportUseCase {
	

    private final ReportDistributionService reportDistributionService;

    public DistributeReportUseCase(ReportDistributionService reportDistributionService) {
        this.reportDistributionService = reportDistributionService;
    }

    public void execute(ReportType reportType) {
        // Raporu dağıt
        reportDistributionService.distributeReport(reportType);
    }

}
