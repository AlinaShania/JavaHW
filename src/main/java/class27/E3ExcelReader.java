package class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constant;

import java.io.FileInputStream;
import java.io.IOException;

public class E3ExcelReader {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(Constant.EXCEL_FILE_PATH);
        //that special call which knows how to read the data from excel files
        XSSFWorkbook xssworkbook = new XSSFWorkbook(fis);
        Sheet sheet = xssworkbook.getSheet("Sheet1");
        int rowSize = sheet.getPhysicalNumberOfRows();

        for (int rowss = 0; rowss<rowSize; rowss++){
            Row rows = sheet.getRow(rowss);
            int colSize = rows.getPhysicalNumberOfCells();
            for(int i=0;i<colSize;i++){
                System.out.print(rows.getCell(i)+" ");
            }
            System.out.println();
        }
       Row row = sheet.getRow(1);
       /* Cell cell = row.getCell(2);
        System.out.println(cell);
        Row row1 = sheet.getRow(0);
        System.out.print(row.getCell(0)+" ");
        System.out.print(row.getCell(1)+" ");
        System.out.print(row.getCell(2)+" "); */
        //i is a column

    }
}
