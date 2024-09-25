package com.baki.oiltrade.infrastructure.xml;

import com.baki.oiltrade.core.domain.entities.ReportGenerator;
import com.baki.oiltrade.core.domain.valueobjects.ReportType;

public class XmlReportGenerator implements ReportGenerator {

    @Override
    public void generateReport(ReportType reportType) {
        if (reportType == ReportType.XML) {
            // XML rapor oluşturma işlemleri
            System.out.println("Generating XML report...");
            // XML formatında raporu burada oluşturun
        } else {
            throw new IllegalArgumentException("Unsupported report type: " + reportType);
        }
    }
}