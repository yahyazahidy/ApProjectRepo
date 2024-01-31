import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;

/**
 * This is a java Doc comment
 * Advanced Programming project Sharif University of Technology
 * Professor: HamidReza Hosseinkhani
 * Doer: Yahya Zahidy
 * winter 1402
 */



public class Main {
    public static void main(String[] args) {

        boolean loopCondition = true;
        int counter = 0;

        while (loopCondition) {
            User[] user = new User[10000];
            user[counter] = new User();
            // choosing language

            System.out.println("Choose Your Language زبان خود را انتخاب کنید");
            System.out.println("Exit (0)       English(1)        فارسی(۲)");
            System.out.print("Put the number hereعدد را اینجا قرار دهید:");

            Scanner input = new Scanner(System.in);
            int numOfLanguage = input.nextInt();
            if (numOfLanguage == 0) {
                break;
            }
            int numOfTask = 0;

            // if you choose English menu of tasks
            if (numOfLanguage == 1) {
                System.out.print("Choose Your Task:" +
                        "\nAdmin -> 1\nLog in -> 2" +
                        "\nCreate New Account ->3\nExit -> 4\n");
                    numOfTask = input.nextInt();
            } else if (numOfLanguage == 2) {
                System.out.println("ادمین->۱");
                System.out.println("ورود -> ۲");
                System.out.println("ایجاد حساب جدید -> ۳");
                System.out.println("خروج -> ۴");
                numOfTask = input.nextInt();

                // if the inserted number be out of numbers for English and persian
            } else {
                System.out.println("Invalid input ورودی نامعتبر");
            }

            // switching to tasks according to chosen tasks
            switch (numOfTask) {
                case 1:
                    Admin admin = new Admin("Yahya","1234");
                    Scanner stdinScanner = new Scanner(System.in);
                    System.out.print(":اسم کاربری ادمین");
                    String name = stdinScanner.nextLine();
                    System.out.println("رمز عبور ادمین");
                    String pass = stdinScanner.nextLine();
                    admin.checkAdmin(name,pass);
                    break;
                case 2:
                    NeedChecKAccounts checkAccountIsExist = new NeedChecKAccounts();
                    boolean isExistAccount = checkAccountIsExist.checkNameAndPass(numOfLanguage);
                    if (isExistAccount) {
                        System.out.println("ok this account exist");
                    } else {
                        if (numOfLanguage == 1) {
                            checkAccountIsExist.checkAccountResultFalse(numOfLanguage);

                        } else {
                            String s = Integer.toString(numOfLanguage);
                            checkAccountIsExist.checkAccountResultFalse(s);
                        }
                    }
                    break;
                case 3:
                    if (numOfLanguage != 1 && numOfLanguage != 2) {
                        System.out.println("Invalid Input ورودی نامعتبر");
                    } else {
                        user[counter].setUserLanguage(numOfLanguage);
                        user[counter++].createAccount(numOfLanguage);
                    }
                    break;
                case 4:
                    loopCondition = false;
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}















































/*public class Main {
    public static void main(String[] args) {

        boolean loopCondition = true;
        int counter = 0;

        while (loopCondition) {
            User[] user = new User[10000];
            user[counter] = new User();
            // choosing language

            System.out.println("Choose Your Language زبان خود را انتخاب کنید");
            System.out.println("Exit (0)       English(1)        فارسی(۲)");
            System.out.print("Put the number hereعدد را اینجا قرار دهید:");

            Scanner input = new Scanner(System.in);
            int numOfLanguage = input.nextInt();
            if (numOfLanguage == 0) {
                break;
            }
            int numOfTask = 0;

            // if you choose English menu of tasks
            if (numOfLanguage == 1) {
                System.out.print("Choose Your Task:" +
                        "\nAdmin -> 1\nLog in -> 2" +
                        "\nCreate New Account ->3\nExit -> 4\n");


                // if choose persinumOfTask = input.nextInt();an menu of tasks
            } else if (numOfLanguage == 2) {
                System.out.println("ادمین->۱");
                System.out.println("ورود -> ۲");
                System.out.println("ایجاد حساب جدید -> ۳");
                System.out.println("خروج -> ۴");
                numOfTask = input.nextInt();

                // if the inserted number be out of numbers for English and persian
            } else {
                System.out.println("Invalid input ورودی نامعتبر");
            }

            // switching to tasks according to chosen tasks
            switch (numOfTask) {
                case 1:
                    Admin admin = new Admin();
                    System.out.println("before admin,setadmin");
                    admin.setAdmin("Yahya", "1234");
                    admin.checkAdmin();
                    System.out.println("after admin.setadmin");
                    break;
                case 2:
                    NeedChecKAccounts checkAccountIsExist = new NeedChecKAccounts();
                    boolean isExistAccount = checkAccountIsExist.checkNameAndPass(numOfLanguage);
                    if (isExistAccount) {
                        System.out.println("ok this account exist");
                    } else {
                        if (numOfLanguage == 1) {
                            checkAccountIsExist.checkAccountResultFalse(numOfLanguage);

                        } else {
                            String s = Integer.toString(numOfLanguage);
                            checkAccountIsExist.checkAccountResultFalse(s);
                        }
                    }
                    break;
                case 3:
                    if (numOfLanguage != 1 && numOfLanguage != 2) {
                        System.out.println("Invalid Input ورودی نامعتبر");
                    } else {
                        user[counter].setUserLanguage(numOfLanguage);
                        user[counter++].createAccount(numOfLanguage);
                    }
                    break;
                case 4:
                    loopCondition = false;
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
*/



















/*
            if(numOfLanguage != 1 && numOfLanguage != 2) {
                    System.out.println("Invalid input ورودی نامعتبر");
            }else{
                user[counter].setUserLanguage(numOfLanguage);
                user[counter].createAccount(numOfLanguage);
            }
            //System.out.println("Exit press zero(0)");
        //}
    }
}*/