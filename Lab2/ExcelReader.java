import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ExcelReader {

    public static void main(String[] args) {
        String filePath = "Table 2.xlsx"; // Specify the path to your file

        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            // Get the first sheet from the workbook
            Sheet sheet = workbook.getSheetAt(0); 

            // Iterate over all rows in the sheet
            for (Row row : sheet) {
                // Iterate over each cell in the row
                for (Cell cell : row) {
                    // Print the value of each cell based on its type
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(cell.getDateCellValue() + "\t");
                            } else {
                                System.out.print(cell.getNumericCellValue() + "\t");
                            }
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        case FORMULA:
                            System.out.print(cell.getCellFormula() + "\t");
                            break;
                        default:
                            System.out.print("Unknown Cell Type\t");
                    }
                }
                System.out.println(); // Move to the next row
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
