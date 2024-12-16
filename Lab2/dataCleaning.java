import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class dataCleaning {
    public static void main(String[] args) {
        String filePath = "Table 2.csv"; // Specify the path to your CSV file

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into columns using comma as the delimiter
                String[] columns = line.split(",");
                
                // Iterate over the columns and replace empty values with "N/A"
                for (int i = 0; i < columns.length; i++) {
                    // Check if the current column is empty
                    if (columns[i].trim().isEmpty()) {
                        columns[i] = "N/A"; // Replace empty column with "N/A"
                    }
                    System.out.print(columns[i] + "\t"); // Print each column value with tab separation
                }
                System.out.println(); // Move to the next line (row)
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
