package org.example;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
//    static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        Workbook wb = new HSSFWorkbook();
        Sheet sheet0 = wb.createSheet("Ведомости на оплату");
        Sheet sheet1 = wb.createSheet("Абоненты");

        Row row = sheet0.createRow(1);
        Cell cell = row.createCell(1);
        cell.setCellValue("O`Rey");
        FileOutputStream fos = new FileOutputStream("D:\\Users\\vkochiyan\\Documents\\NewWorkBook\\123.xls");
        wb.write(fos);
        fos.close();
    }
    
    
}