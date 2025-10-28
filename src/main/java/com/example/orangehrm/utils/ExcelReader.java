package com.example.orangehrm.utils;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelReader {
    public static Object[][] getExcelData(String filepath, String sheetname) {
        Object[][] data;

try (FileInputStream fis = new FileInputStream(filepath);
     Workbook workbook = new XSSFWorkbook(fis)) {
    Sheet sheet = workbook.getSheet(sheetname);
    int rowCount = sheet.getPhysicalNumberOfRows();
    int colCount = sheet.getRow(0).getLastCellNum();
    data = new Object[rowCount - 1][colCount];
    DataFormatter dataformat = new DataFormatter();
    for (int i = 1; i < rowCount; i++) {
        Row row = sheet.getRow(i);
        if (row == null) {
            continue;
        }
        for (int j = 0; j < colCount; j++) {
            Cell cell = row.getCell(j);
            data[i - 1][j] = dataformat.formatCellValue(cell);
        }
    }
} catch (Exception e) {
    e.printStackTrace();
    data = new Object[0][0];
}
        return data;
    }
}