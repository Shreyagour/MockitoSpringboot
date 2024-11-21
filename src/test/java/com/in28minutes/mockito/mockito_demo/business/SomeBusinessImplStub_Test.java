package com.in28minutes.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStub_Test {

	@Test
	void findGreatestofAll_basic() {
		DataServiceStub ds=new DataServiceStub();
		SomeBusinessImpl businessImpl=new SomeBusinessImpl(ds);
		int result=businessImpl.findGreatestofAll();
		assertEquals(40,result);
	}
	
	void findGreatestofAll_withOne() {
		DataServiceStub2 ds2=new DataServiceStub2();
		SomeBusinessImpl businessImpl=new SomeBusinessImpl(ds2);
		int result=businessImpl.findGreatestofAll();
		assertEquals(100,result);
	}

}
class DataServiceStub implements DataService{

	@Override
	public int[] fetchAllData() {
		// TODO Auto-generated method stub
		return new int[] {20,30,40};
	}
	
}

class DataServiceStub2 implements DataService{

	@Override
	public int[] fetchAllData() {
		// TODO Auto-generated method stub
		return new int[] {100};
	}
	
}
