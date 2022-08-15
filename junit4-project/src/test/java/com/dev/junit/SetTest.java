package com.dev.junit;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class SetTest {

	@Test
	public void verifyInteractions() {
		Set mockSet = mock(Set.class);
		Set<String> toAdd = new HashSet<String>();
		mockSet.addAll(toAdd);
		mockSet.clear();
		verify(mockSet).addAll(toAdd);
		verify(mockSet).clear();
		
		verify(mockSet, times(1)).clear();
	}
	
	@Test
	public void stubMethodCalls() {
	  Set mockSet = mock(Set.class);
	  when(mockSet.size()).thenReturn(10);
	  Assert.assertEquals(10, mockSet.size());
	}
}
