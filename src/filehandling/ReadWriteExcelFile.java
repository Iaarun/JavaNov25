package filehandling;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ReadWriteExcelFile {
  String filepath = "E:\\JavaNovember25\\LearnAutomation\\src\\filehandling\\TestData.xlsx";
    public static void main(String[] args) throws IOException {
        ReadWriteExcelFile obj = new ReadWriteExcelFile();
        obj.writeDiffTypeTableData();
    }
    public void readExcelFileExample() throws IOException {
        // Implementation for reading Excel files will go here
        System.out.println("Reading Excel file...");

        File file = new File(filepath);
        FileInputStream fis = new FileInputStream(file);
        // Use Apache POI or similar library to read Excel file
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet= workbook.getSheet("Sheet1");
       //  workbook.getSheetIndex(0);
        XSSFRow row= sheet.getRow(0);
        double value=  row.getCell(1).getNumericCellValue();
        System.out.println("Value from Excel: " + value);
    }

    public void writeExcelFileExample()throws IOException{
        // Implementation for writing Excel files will go here
        System.out.println("Writing to Excel file...");
        File file = new File(filepath);
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        //to write data into excel sheet
        XSSFSheet sheet=  workbook.createSheet("TestSheet");
        XSSFRow row= sheet.createRow(5);
        row.createCell(3).setCellValue("Test Data");
        //write the data in the file
        FileOutputStream fos= new FileOutputStream(file);
        workbook.write(fos);
        fos.close();
        workbook.close();
        System.out.println("Data written successfully.");

    }

    public void readTableData() throws IOException {
        File file = new File(filepath);
        // Implementation for reading table data from Excel file will go here
        System.out.println("Reading table data from Excel file...");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet= workbook.getSheet("Student");
       int noOfRows=  sheet.getPhysicalNumberOfRows();
        System.out.println("No of rows: "+ noOfRows);
        int noOfCells= sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("No of cells: "+ noOfCells);

         for(int r=0; r<noOfRows ; r++){
             XSSFRow row= sheet.getRow(r);
             for(int c=0; c<noOfCells-1; c++){
                 String value= row.getCell(c).getStringCellValue();
                 System.out.print(value + " | ");
             }
             System.out.println();
         }

    }

    public void readDiffTypeTableData() throws IOException {
        File file = new File(filepath);
        // Implementation for reading table data from Excel file will go here
        System.out.println("Reading table data from Excel file...");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet= workbook.getSheet("Student");
        Iterator<Row> rowIterator= sheet.iterator();
        while (rowIterator.hasNext()){
           Row row= rowIterator.next();
           Iterator<Cell> cellIterator= row.cellIterator();
           while (cellIterator.hasNext()){
            Cell cell =    cellIterator.next();
             switch (cell.getCellType()){
                 case STRING:
                     System.out.print(cell.getStringCellValue() + " | ");
                     break;
                 case NUMERIC:
                     System.out.print(cell.getNumericCellValue() + " | ");
                     break;
                 case BOOLEAN:
                     System.out.print(cell.getBooleanCellValue() + " | ");
                     break;
             }
           }
            System.out.println();
        }
    }

    public void writeDiffTypeTableData() throws IOException {
        Map<String, Object[]> data = new LinkedHashMap<>();
        data.put("1", new Object[]{"ID", "NAME", "SALARY", "ACTIVE"});
        data.put("2", new Object[]{1, "John Doe", 55000.75, true});
        data.put("3", new Object[]{2, "Jane Smith", 62000.00, false});
        data.put("4", new Object[]{3, "Sam Brown", 72000.50, true});
        data.put("5", new Object[]{4, "Lisa White", 48000.25, true});

        File file = new File(filepath);
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet=  workbook.createSheet("EmployeeData");

        int rowCount = 0;
        for (String key : data.keySet()) {
           Row row=  sheet.createRow(rowCount++);
          Object[] objArr=  data.get(key);
          int cellCount=0;
            for(Object obj: objArr){
              Cell cell=  row.createCell(cellCount++);
              if (obj instanceof String){
                  cell.setCellValue((String)obj);
              } else if (obj instanceof Integer){
                  cell.setCellValue((Integer)obj);
              } else if (obj instanceof Double){
                  cell.setCellValue((Double)obj);
              } else if (obj instanceof Boolean){
                  cell.setCellValue((Boolean)obj);
              }
            }
        }
         FileOutputStream fout = new FileOutputStream(file);
         workbook.write(fout);
         fout.close();
         workbook.close();
         System.out.println("Data written successfully.");

    }
}
