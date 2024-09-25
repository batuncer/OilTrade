package com.baki.oiltrade.core.domain.entities;

import com.baki.oiltrade.core.domain.valueobjects.ReportType;

public interface ReportGenerator {
	
	void generateReport(ReportType reportType);

}
