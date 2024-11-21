package com.in28minutes.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMock_Test {
	
	@Mock
	private DataService dsmock;
	
	@InjectMocks
	private SomeBusinessImpl businessImpl;
	

	@Test
	void findGreatestofAll_basic() {
//		DataService dsmock=mock(DataService.class);
		when(dsmock.fetchAllData()).thenReturn(new int[]{30,40,50,12});
//		SomeBusinessImpl businessImpl=new SomeBusinessImpl(dsmock);
		int result=businessImpl.findGreatestofAll();
		assertEquals(50,result);
	}
	@Test
	void findGreatestofAll_OneValue() {
//		DataService dsmock=mock(DataService.class);
		when(dsmock.fetchAllData()).thenReturn(new int[]{30});
//		SomeBusinessImpl businessImpl=new SomeBusinessImpl(dsmock);
		int result=businessImpl.findGreatestofAll();
		assertEquals(30,result);
	}

}



