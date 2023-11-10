package com.Data.export;

import java.io.File;
import java.util.List;

import com.Data.IExportData;

public class ExportPDF implements IExportData {

	@Override
	public File exportData(List<Object[]> listData) {
		File pdfFile = null;
		// logic to generate the PDF file
		System.out.println("Generating PDF file...");
		return pdfFile;
	}

}
