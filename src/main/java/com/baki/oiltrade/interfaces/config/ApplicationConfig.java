package com.baki.oiltrade.interfaces.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baki.oiltrade.infrastructure.pdf.PdfReportGenerator;
import com.baki.oiltrade.infrastructure.xml.XmlReportGenerator;

@Configuration
public class ApplicationConfig {

    @Bean
    public XmlReportGenerator xmlReportGenerator() {
        return new XmlReportGenerator();
    }

    @Bean
    public PdfReportGenerator pdfReportGenerator() {
        return new PdfReportGenerator();
    }


}