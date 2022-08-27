package com.dev.junit.isa;

import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.hamcrest.MockitoHamcrest.argThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(value = MockitoJUnitRunner.class)
public class RocketSimulatorTest {

	@InjectMocks
	RocketSimulator rocketSimulator;
	
	@Mock
	RocketService rocketService;
	
	@Test
	public void test() {
		//Given
		Rocket nasaRocket = new NasaRocket();
		Rocket isroRocket = new IsroRocket();
		when(rocketService.getRocketService(argThat(isA(NasaRocket.class)))).thenReturn("NASA Rocket");
		when(rocketService.getRocketService(argThat(isA(IsroRocket.class)))).thenReturn("ISRO Rocket");
		
		//When
		String actual_1 = rocketSimulator.getRocketType(nasaRocket);
		String actual_2 = rocketSimulator.getRocketType(isroRocket);
		
		//Then
		assertEquals("NASA Rocket", actual_1);
		assertEquals("ISRO Rocket", actual_2);
	}

}
