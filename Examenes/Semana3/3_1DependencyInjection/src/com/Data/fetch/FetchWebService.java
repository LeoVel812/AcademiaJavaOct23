package com.Data.fetch;

import java.util.ArrayList;
import java.util.List;

import com.Data.IFetchData;

public class FetchWebService implements IFetchData {

	@Override
	public List<Object[]> fetchData() {
		List<Object[]> dataFromWebService = new ArrayList<>();
		// Logic to call web service and fetch the data
		System.out.println("Fetching data from web service...");
		return dataFromWebService;
	}

}
