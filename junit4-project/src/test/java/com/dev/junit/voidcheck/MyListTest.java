package com.dev.junit.voidcheck;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

public class MyListTest {

	/**
	 * This is one of the way to unit test the void method
	 */
	@Test
	public void whenAddCalledValueCaptured() {
		MyList myList = mock(MyList.class);
		ArgumentCaptor<String> valueCapture = ArgumentCaptor.forClass(String.class);
		doNothing().when(myList).add(Mockito.any(Integer.class), valueCapture.capture());
		myList.add(0, "captured");
		assertEquals("captured", valueCapture.getValue());
	}

	/**
	 * This is one of the way to unit test the void method
	 */
	@Test
	public void whenAddCalledAnswered() {
		MyList myList = mock(MyList.class);
		doAnswer(invocation -> {
			Object arg0 = invocation.getArgument(0);
			Object arg1 = invocation.getArgument(1);

			assertEquals(3, arg0);
			assertEquals("answer me", arg1);
			return null;
		}).when(myList).add(Mockito.any(Integer.class), Mockito.any(String.class));
		myList.add(3, "answer me");
	}

}
