package com.in28minutes.mockito.mockito_demo.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListTest {

	@Test
	void test() {
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(3);
		assertEquals(3,listMock.size());
	}
	
	@Test
	void multipleReturns() {
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(1).thenReturn(2);
		assertEquals(1,listMock.size());
		assertEquals(2,listMock.size());
		assertEquals(2,listMock.size()); // last returned value is default returned later
//		assertEquals(5,listMock.size());// this will give error
	}
	
	@Test
	void specificPramaters() {
		List listMock=mock(List.class);
		when(listMock.get(0)).thenReturn("SomeString");
		assertEquals("SomeString",listMock.get(0));
		assertEquals(null,listMock.get(1));
		
	}
	
	@Test
	void generalPramaters() {
		List listMock=mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("SomeString");
		assertEquals("SomeString",listMock.get(0));
		assertEquals("SomeString",listMock.get(1));
		
	}

}
