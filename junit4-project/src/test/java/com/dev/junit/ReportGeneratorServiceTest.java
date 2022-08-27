package com.dev.junit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(value = MockitoJUnitRunner.class)
public class ReportGeneratorServiceTest {

	@InjectMocks
	ReportGeneratorService reportGeneratorService;

	@Mock
	IReportGenerator iReportGenerator;

	@Captor
	ArgumentCaptor<ReportEntity> captor;
	
	@Test
	public void test() {
		//Given
		Calendar startDate = Calendar.getInstance();
		startDate.set(2016, 11, 25);
		Calendar endDate = Calendar.getInstance();
		endDate.set(9999, 12, 31);
		String reportContent = "Report Content";
		
		//When
		reportGeneratorService.generateReport(startDate.getTime(), endDate.getTime(), reportContent.getBytes());
		
		//Then
		verify(iReportGenerator).generateReport(captor.capture()); //Argument Captor
		
		ReportEntity capturedValue = captor.getValue();
		assertEquals(11, capturedValue.getStartDate().getMonth()); 
		verify(iReportGenerator, times(1)).generateReport(capturedValue);
	}

}
