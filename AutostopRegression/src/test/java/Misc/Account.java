package Misc;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Account {
    private String name;
    private String aaanumber;

    public Account() {
    }

    public String toString() {
        return String.format("%s - %s - %f", name, aaanumber);
    }

    // getters and setters
    public void setName(String name)
    {
        
    }

    public void setAAANum(String aaanum)
    {

    }

    private Object getCellValue(Cell cell) {
        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_STRING:
                return cell.getStringCellValue();

            case Cell.CELL_TYPE_BOOLEAN:
                return cell.getBooleanCellValue();

            case Cell.CELL_TYPE_NUMERIC:
                return cell.getNumericCellValue();
        }

        return null;
    }

    public List<Account> readBooksFromExcelFile(String excelFilePath) throws IOException {
        List<Account> listAccounts = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = firstSheet.iterator();

        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            Account aAccount = new Account();

            while (cellIterator.hasNext()) {
                Cell nextCell = cellIterator.next();
                int columnIndex = nextCell.getColumnIndex();

                switch (columnIndex) {
                    case 1:
                        aAccount.setName((String) getCellValue(nextCell));
                        break;
                    case 2:
                        aAccount.setAAANum((String) getCellValue(nextCell));
                        break;
                }
            }
            listAccounts.add(aAccount);
        }

        workbook.close();
        inputStream.close();

        return listAccounts;
    }
}
