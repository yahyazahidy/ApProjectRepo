import javax.swing.plaf.basic.BasicButtonUI;
import java.io.*;
import java.util.Scanner;

class Admin extends Person implements IranIntroduction {
    final static String touristicPlaceFileName = "TouristicPlace.txt";

    public Admin(String name,String pass) {
        this.userName = name;
        this.password = pass;
    }
    public Admin() {
    }
    Admin admin1 = new Admin();
    public void checkAdmin(String name, String pass) {
        Scanner stdinScanner = new Scanner(System.in);
        if (name.equals(userName) && pass.equals(password)) {
            System.out.println("Welcome");
            boolean loopCondition = true;
            //do{
            System.out.print("Adding  Infomation (1)\n" +
                    "Adding Driver(2)\nAdding Hotel(3)\n" +
                    "Adding phone(4) \nExit(0)\n");
            int n = stdinScanner.nextInt();
            switch (n) {
                case 1:
                    Admin admin = new Admin();
                    admin1.IranTouristicPlace();
                    break;
                case 2:
                    //driver
                    break;
                case 3:
                    // hotel;
                    break;
                case 4:
                    //phone;
                    break;
                case 0:
                    loopCondition = false;
                    break;
                default:
                    System.out.println("Invalid");
            }
            //}while (loopCondition);
        } else {
            System.out.println("اسم ادمین ویا رمز عبور ادمین اشتباه");
        }
    }

    // method to add information about Iran
    public void IranTouristicPlace() {
        Scanner stdinScanner = new Scanner(System.in);
        try {
            File file = new File(touristicPlaceFileName);
            FileWriter fr = new FileWriter(file);
            BufferedWriter br = new BufferedWriter(fr);
            System.out.println("Insert your Information");
            String info = stdinScanner.nextLine();
            br.write(info);
            br.newLine();
            br.close();
            fr.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
































/*   public void AddingInfo() {
        System.out.println("Touristic (1) Religious (2)   Nice Wether (3)");
        int nn = stdinScanner.nextInt();
        switch (nn) {
            case 1:
                admin1.IranTouristicPlace();
                break;
            case 2:
                admin1.IranReligiousPlace();
                break;
            case 3:
                admin1.IranGoodWetherPlace();
                break;
            default:
                System.out.println("Invalid input");
        }
    }
    public void IranTouristicPlace() {
        try {
            boolean continue_ = true;

                File file = new File(touristicPlaceFileName);
                FileWriter fr = new FileWriter(file);
                BufferedWriter br = new BufferedWriter(fr);
                System.out.println("Insert your Information");
                String info = stdinScanner.nextLine();
                br.write(info);
                br.newLine();
                br.close();
                fr.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void IranReligiousPlace() {
        try {
            boolean continue_ = true;

            File file = new File(religiousPlaceFileName);
            FileWriter fr = new FileWriter(file);
            BufferedWriter br = new BufferedWriter(fr);
            System.out.println("Insert your information:");
            br.write(stdinScanner.nextLine());
            br.newLine();
            br.close();
            fr.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void IranGoodWetherPlace() {
        try {
            boolean continue_ = true;

            File file = new File(goodWetherPlaceFileName);
            FileWriter fr = new FileWriter(file);
            BufferedWriter br = new BufferedWriter(fr);
            System.out.println("Insert Your Information");
            br.write(stdinScanner.nextLine());
            br.newLine();
            br.close();
            fr.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/