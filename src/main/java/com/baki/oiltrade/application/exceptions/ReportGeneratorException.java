package com.baki.oiltrade.application.exceptions;

public class ReportGeneratorException extends RuntimeException {
    public ReportGeneratorException(String message) {
        super(message);
    }

    public ReportGeneratorException(String message, Throwable cause) {
        super(message, cause);
    }
}