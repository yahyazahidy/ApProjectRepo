import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User extends Person{
    private int userLanguage;

    // userLanguage setter
    public void setUserLanguage(int userLanguage) {

        this.userLanguage = userLanguage;
    }
    // creating New Account method
    public void createAccount(int userLanguage) {
        Scanner stdinScanner = new Scanner(System.in);
        HashMap<String,String> accountMap = new HashMap<String,String>();
        if(userLanguage == 1) {
            try {
            File fileE = new File("UsersDetails.txt");
            FileWriter fr = new FileWriter(fileE,true);
            BufferedWriter br = new BufferedWriter(fr);
            System.out.print("Insert userName:");
            userName = stdinScanner.next();
            System.out.print("Insert password:");
            password = stdinScanner.next();
            accountMap.put(userName,password);
            for (Map.Entry<String,String> entry: accountMap.entrySet()) {
                br.write(entry.getKey() +":" + entry.getValue());
                br.newLine();
            }
            br.flush();
            br.close();
            fr.close();
        }catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try {
                File fileP = new File("UsersDetails.txt");
                FileWriter fr = new FileWriter(fileP,true);
                BufferedWriter br = new BufferedWriter(fr);
                System.out.print("اسم کاربری خود را وارد نماید:");
                userName = stdinScanner.next();
                System.out.print("شماره رمز کاربری خود را وارد کنید:");
                password = stdinScanner.next();
                accountMap.put(userName,password);
                for (Map.Entry<String,String> entry: accountMap.entrySet()) {
                    br.write(entry.getKey() +":"+ entry.getValue());
                    br.newLine();
                }
                br.flush();
                br.close();
                fr.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
