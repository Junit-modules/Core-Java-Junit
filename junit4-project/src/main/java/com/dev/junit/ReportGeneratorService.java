package com.dev.junit;

import java.util.Date;

public class ReportGeneratorService {

	IReportGenerator iReportGenerator;
	
	public ReportGeneratorService(IReportGenerator iReportGenerator) {
		this.iReportGenerator = iReportGenerator;
	}
	
	public void generateReport(Date startDate, Date endDate, byte[] content) {
		ReportEntity reportEntity =  new ReportEntity();
		reportEntity.setStartDate(startDate);
		reportEntity.setEndDate(endDate);
		reportEntity.setContent(content);
	    this.iReportGenerator.generateReport(reportEntity);
	}
}
