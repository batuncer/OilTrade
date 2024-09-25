package com.baki.oiltrade.infrastructure.pdf;

import com.baki.oiltrade.core.domain.entities.ReportGenerator;
import com.baki.oiltrade.core.domain.valueobjects.ReportType;


public class PdfReportGenerator implements ReportGenerator {

    @Override
    public void generateReport(ReportType reportType) {
        if (reportType != ReportType.PDF) {
            throw new IllegalArgumentException("Invalid report type for PDF generator.");
        }
        System.out.println("Generating PDF report...");
        // PDF raporu oluşturma kodu buraya gelecek
    }
}