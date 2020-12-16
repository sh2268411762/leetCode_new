//package com.gdpph.o1kuaixue.demo.chapter14.section8.section1;
//
//import java.io.*;
//import org.apache.poi.ss.usermodel.*;
///**
// * Excel处理示例
// * @author 零壹学堂
// */
//public class ExcelHandler {
//    public static void read() {
//        File file = new File("data.xlsx");
//        InputStream inputStream = null;
//        Workbook workbook = null;
//        try {
//            inputStream = new FileInputStream(file);
//            workbook = WorkbookFactory.create(inputStream);
//            inputStream.close();
//            Sheet sheet = workbook.getSheetAt(0); // 工作表
//            int rowLength = sheet.getLastRowNum() + 1; // 总行数
//            Row row = sheet.getRow(0); // 工作表的列
//            int colLength = row.getLastCellNum(); // 总列数
//            Cell cell = row.getCell(0); // 得到指定的单元格
//            CellStyle cellStyle = cell.getCellStyle(); // 得到单元格样式
//            System.out.println("行数：" + rowLength + ",列数：" + colLength);
//            for (int i = 0; i < rowLength; i++) {
//                row = sheet.getRow(i);
//                for (int j = 0; j < colLength; j++) {
//                    cell = row.getCell(j);
//                    if (cell != null)
//                        cell.setCellType(CellType.STRING);
//                    System.out.print(cell.getStringCellValue() + "\t");
//                }
//                System.out.println();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public static void main(String[] args) {
//        read();
//    }
//}
