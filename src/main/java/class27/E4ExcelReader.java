package class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constant;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E4ExcelReader {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(Constant.EXCEL_FILE_PATH);
        //that special call which knows how to read the data from excel files
        XSSFWorkbook xssworkbook = new XSSFWorkbook(fis);
        Sheet sheet = xssworkbook.getSheet("Sheet1");
        List<Map<String,String>> excelSheet= new ArrayList<>();

        Row headerRow = sheet.getRow(0);

        for (int rows = 1;rows<sheet.getPhysicalNumberOfRows(); rows++){
            Row row = sheet.getRow(rows);

            Map<String, String> rowMap = new HashMap<>();
            for (int col = 0; col< row.getPhysicalNumberOfCells(); col++){
                String key = headerRow.getCell(col).toString();
                String value = row.getCell(col).toString();
                rowMap.put(key,value);
            }
            excelSheet.add(rowMap);
        }
        System.out.println(excelSheet);

    }
}
