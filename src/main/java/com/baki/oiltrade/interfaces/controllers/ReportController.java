package com.baki.oiltrade.interfaces.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.baki.oiltrade.application.services.ReportService;
import com.baki.oiltrade.core.domain.valueobjects.ReportType;

public class ReportController {
	

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/report/generate")
    public String generateReport(@RequestParam("type") ReportType reportType) {
        reportService.generateReport(reportType);
        return "Report generated successfully";
    }

}
