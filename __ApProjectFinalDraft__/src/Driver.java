import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Driver extends Person {
    private String typeOfCar;

    Scanner input = new Scanner(System.in);
    final static String driverFileName = "DriveFile.txt";

    public void addingDriver() {
        HashMap<String, String> map = new HashMap<String, String>();

        Driver driver = new Driver();

        driver.password = "1234";
        try {
            File file = new File(driverFileName);
            BufferedWriter br = new BufferedWriter(new FileWriter(file));

            System.out.println("Driver Name:");
            String name = input.nextLine();

            System.out.println("Enter the Type of Car:");
            String type = input.nextLine();

            driver.userName = name;
            driver.typeOfCar = type;

            map.put(name, type);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                br.write(entry.getKey() + ":" + entry.getValue());
            }
            br.newLine();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}