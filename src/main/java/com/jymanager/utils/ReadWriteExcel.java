package com.jymanager.utils;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Iterator;  
  
import org.apache.commons.codec.binary.Base64;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;  
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
  
  
public class ReadWriteExcel 
{  
  /*
  public static void readXLSFile() throws IOException  
  {  
    InputStream ExcelFileToRead = new FileInputStream("C:/Test.xls");  
    HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);  
  
    HSSFSheet sheet = wb.getSheetAt(0);  
    HSSFRow row;  
    HSSFCell cell;  
  
    Iterator rows = sheet.rowIterator();  
  
    while (rows.hasNext())  
    {  
      row = (HSSFRow) rows.next();  
      Iterator cells = row.cellIterator();  
  
      while (cells.hasNext())  
      {  
        cell = (HSSFCell) cells.next();  
  
        if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING)  
        {  
          System.out.print(cell.getStringCellValue() + " ");  
        }  
        else if (cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC)  
        {  
          System.out.print(cell.getNumericCellValue() + " ");  
        }  
        else  
        {  
          // U Can Handel Boolean, Formula, Errors  
        }  
      }  
      System.out.println();  
    }  
  
  }  
  */
	
  public static void Data2XLSStream(String[][] datas, OutputStream  out) throws IOException  
  {  
  
    String sheetName = "Export";
  
    HSSFWorkbook wb = new HSSFWorkbook();  
    HSSFSheet sheet = wb.createSheet(sheetName);  
  
    // iterating r number of rows  
    int rowindex = 0;
    for (String[] rowarray : datas)  
    {  
      HSSFRow row = sheet.createRow(rowindex++);  
  
      // iterating c number of columns  
      short colindex = 0;
      for (String value : rowarray)  
      {  
        HSSFCell cell = row.createCell(colindex++);
        //cell.setEncoding(HSSFCell.ENCODING_UTF_16);
        cell.setCellValue(value);  
        //cell.setCellValue("test"); 
      }  
    }  
  
    
    //FileOutputStream fileOut = new FileOutputStream("c:\\export.xls");
  
    
    //wb.write(fileOut);  
    //fileOut.flush();
    //fileOut.close();
    
    //FileInputStream fileIn = new FileInputStream("c:\\test.txt");
    
    //byte[] buf = new byte[fileIn.available()];
    //fileIn.read(buf); 

    
    //ByteArrayOutputStream baos = new ByteArrayOutputStream();
    //wb.write(baos);
    
    //byte[] buf =  Base64.encodeBase64(baos.toByteArray());
    
    //out.write(buf);
    // write this workbook to an Outputstream.  
    
    wb.write(out);  
    out.flush();
    wb.close();
    

	return;  
  }  
  
  /*
  public static void readXLSXFile() throws IOException  
  {  
    InputStream ExcelFileToRead = new FileInputStream("C:/Test.xlsx");  
    XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);  
  
    XSSFWorkbook test = new XSSFWorkbook();  
  
    XSSFSheet sheet = wb.getSheetAt(0);  
    XSSFRow row;  
    XSSFCell cell;  
  
    Iterator rows = sheet.rowIterator();  
  
    while (rows.hasNext())  
    {  
      row = (XSSFRow) rows.next();  
      Iterator cells = row.cellIterator();  
      while (cells.hasNext())  
      {  
        cell = (XSSFCell) cells.next();  
  
        if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)  
        {  
          System.out.print(cell.getStringCellValue() + " ");  
        }  
        else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)  
        {  
          System.out.print(cell.getNumericCellValue() + " ");  
        }  
        else  
        {  
          // U Can Handel Boolean, Formula, Errors  
        }  
      }  
      System.out.println();  
    }  
  
  }  
  
  
  public static void Data2XLSXStream() throws IOException  
  {  
  
    String excelFileName = "C:/Test.xlsx";// name of excel file  
  
    String sheetName = "Sheet1";// name of sheet  
  
    XSSFWorkbook wb = new XSSFWorkbook();  
    XSSFSheet sheet = wb.createSheet(sheetName);  
  
    // iterating r number of rows  
    for (int r = 0; r < 5; r++)  
    {  
      XSSFRow row = sheet.createRow(r);  
  
      // iterating c number of columns  
      for (int c = 0; c < 5; c++)  
      {  
        XSSFCell cell = row.createCell(c);  
  
        cell.setCellValue("Cell " + r + " " + c);  
      }  
    }  
  
    FileOutputStream fileOut = new FileOutputStream(excelFileName);  
  
    // write this workbook to an Outputstream.  
    wb.write(fileOut);  
    fileOut.flush();  
    fileOut.close();  
  }  */
  
}  