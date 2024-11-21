package com.in28minutes.mockito.mockito_demo.business;

public class SomeBusinessImpl {
	private DataService dataservice;
	
	public SomeBusinessImpl(DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}

	public int findGreatestofAll() {
		int maxValue=Integer.MIN_VALUE;
		int[] data=dataservice.fetchAllData();
		for(int val:data) {
			if(val>maxValue) {
				maxValue=val;
			}
		}
		return maxValue;
	  }
}

interface DataService{
	int[] fetchAllData();
}
