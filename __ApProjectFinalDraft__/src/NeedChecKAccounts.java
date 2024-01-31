import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class NeedChecKAccounts extends Person{

    public void checkAccountResultFalse(int Language){
        System.out.println("Username or password incorrect, please try again");
    }
    public void checkAccountResultFalse(String Language){
        System.out.println(" نام کاربری یا رمزعبور اشتباه است");
   }
    // Users Details filepath and name
    final static String fileName = "UsersDetails.txt";
             // method which reads the file of User Details and check whether the account Exist or not;
    public boolean checkNameAndPass(int numOfLan) {
        Scanner stdinScanner = new Scanner(System.in);
        String insertName = null;
        String insertPass = null;
        if(numOfLan == 1) {
            System.out.print("Insert Your Username--> ");
            insertName = stdinScanner.next();
            System.out.print("Insert your password --> ");
            insertPass = stdinScanner.next();
        }else{
            System.out.print("اسم کاربری خود را وارد نماید->");
            insertName = stdinScanner.next();
            System.out.print("رمز عبور خود را وارد نماید->");
            insertPass = stdinScanner.next();
        }
        BufferedReader br = null;
            boolean isAlreadyUserExist = false;
            try {
                File file = new File(fileName);
                br = new BufferedReader(new FileReader(file));
                String line = null;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(":");
                    String name = parts[0].trim();
                    String pass = parts[1].trim();

                    if(name.equals(insertName) && pass.equals(insertPass)) {
                        isAlreadyUserExist = true;
                    }
                }
            }catch (Exception e) {
                e.printStackTrace();
            }finally {
                if(br != null) {
                    try{
                        br.close();
                    }catch (Exception e) {
                    }
                }
            }
            return isAlreadyUserExist;
    }
}

