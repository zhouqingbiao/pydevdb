package com.pydevdb.application;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import javax.swing.filechooser.FileSystemView;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建一个空的工作簿
        Workbook xssf = new XSSFWorkbook();

        // 创建sheet页
        Sheet sheet = xssf.createSheet("第一个sheet页");

        // 创建第一行
        Row row0 = sheet.createRow(0);

        // 第一行第一列单元格设置值
        row0.createCell(0).setCellValue("编号");

        // 第一行第二列单元格设置值
        row0.createCell(1).setCellValue("姓名");

        // 第一行第三列单元格设置值
        row0.createCell(2).setCellValue("年龄");

        // 第一行第四列单元格设置值
        row0.createCell(3).setCellValue("性别");

        // 第一行第五列单元格设置值
        row0.createCell(4).setCellValue("生日");

        // 创建第一行
        Row row1 = sheet.createRow(1);

        // 第二行第一列单元格设置值
        row1.createCell(0).setCellValue("10010");

        // 第二行第二列单元格设置值
        row1.createCell(1).setCellValue("张三");

        // 第二行第三列单元格设置值
        row1.createCell(2).setCellValue("15");

        // 第二行第四列单元格设置值
        row1.createCell(3).setCellValue("男");

        // 设置时间格式
        // 创建一个单元格的样式，单元格样式类
        CellStyle cs = xssf.createCellStyle();
        CreationHelper ch = xssf.getCreationHelper();

        // 格式化日期
        cs.setDataFormat(ch.createDataFormat().getFormat("yyyy-MM-dd HH:mm:ss"));

        // 得到这个单元格，用于赋值和设置单元格的格式
        // 第二行第五列单元格设置值
        row1.createCell(4).setCellValue(new Date());
        row1.getCell(4).setCellStyle(cs);

        // 自动列宽
        sheet.autoSizeColumn(row1.getCell(4).getColumnIndex());

        // 创建输出流
        FileOutputStream fos = new FileOutputStream(
                FileSystemView.getFileSystemView().getHomeDirectory() + File.separator + "xssf.xlsx");

        // 写入到流中，创建这个excel文件
        xssf.write(fos);

        // 关闭工作簿
        xssf.close();

        // 关闭流
        fos.close();
    }
}
