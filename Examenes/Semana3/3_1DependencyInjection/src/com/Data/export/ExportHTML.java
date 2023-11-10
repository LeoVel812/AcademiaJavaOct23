package com.Data.export;

import java.io.File;
import java.util.List;

import com.Data.IExportData;

public class ExportHTML implements IExportData {

	@Override
	public File exportData(List<Object[]> listData) {
		File outputHTML = null;
		// logic to generate the HTML file
		System.out.println("Generating HTML file...");
		return outputHTML;
	}

}
