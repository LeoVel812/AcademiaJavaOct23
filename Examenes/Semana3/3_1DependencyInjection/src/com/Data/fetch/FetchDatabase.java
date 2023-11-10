package com.Data.fetch;

import java.util.ArrayList;
import java.util.List;

import com.Data.IFetchData;

public class FetchDatabase implements IFetchData {

	@Override
	public List<Object[]> fetchData() {
		List<Object[]> dataFromDB = new ArrayList<>();
		// Logic to call database, execute queries and fetch the data
		System.out.println("Fetching data from database...");
		return dataFromDB;
	}

}
