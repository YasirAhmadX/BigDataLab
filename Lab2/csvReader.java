import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class csvReader{
    public static void main(String[] args) {
        String filePath = "Table 2.csv"; // Specify the path to your CSV file

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into columns using comma as the delimiter
                String[] columns = line.split(",");
                
                // Iterate over the columns and print the values
                for (String column : columns) {
                    System.out.print(column + "\t"); // Print each column value with tab separation
                }
                System.out.println(); // Move to the next line (row)
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
