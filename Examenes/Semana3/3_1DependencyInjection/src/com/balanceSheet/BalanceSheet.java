package com.balanceSheet;

import java.util.List;

import com.Data.IExportData;
import com.Data.IFetchData;

public class BalanceSheet {
	private IExportData exportDataObj = null;
	private IFetchData fetchDataObj = null;

	/* FIRST APPROACH */
	// -----If only this method exist, there's still dependency here to create
	// objects in this class-----
//	public Object generateBalanceSheet() {
//		List<Object[]> data = fetchDataObj.fetchData();
//		return exportDataObj.exportData(data);
//	}
	// ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- -----

	/* SECOND APPROACH */
//	// Set the fetch data object from outside of this class
//	public void configureFetchData(IFetchData currentFetchDataObj) {
//		this.fetchDataObj = currentFetchDataObj;
//	}
//
//	// Set the export data object from outside of this class
//	public void configureExportData(IExportData currentExportDataObj) {
//		this.exportDataObj = currentExportDataObj;
//	}

	/* THIRD APPROACH */
	// All dependencies are injected from client's constructor
	BalanceSheet(IFetchData fetchData, IExportData exportData) {
		this.fetchDataObj = fetchData;
		this.exportDataObj = exportData;
	}

	public Object generateBalanceSheet() {
		List<Object[]> data = fetchDataObj.fetchData();
		return exportDataObj.exportData(data);
	}
}
