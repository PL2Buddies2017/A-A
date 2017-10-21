package register;
import java.util.*;
import java.io.*;
public class Register {

  
    public static void main(String[] args) {
        System.out.println("    -------------\n    | 1- login  |\n    | 2- signUp |\n    -------------");
        Scanner scan = new Scanner(System.in);
        account acc = new account();
        String file = "accounts.dat";
        String validFile = "validAccounts.dat";
         try (
            InputStream inputStream = new FileInputStream(file);
            OutputStream outputStream = new FileOutputStream(validFile, true);
        ) {
             int n = scan.nextInt();
             if(n == 1){
                int userRead, passRead;
                System.out.println("Please Enter Username:");
                acc.username = scan.nextInt();
                System.out.println("Please Enter Password1:");
                acc.password = scan.nextInt();
                while ((userRead = inputStream.read()) != -1) {
                    passRead = inputStream.read();
                    if(acc.login(userRead, passRead) == 1){
                        System.out.println("Logged in! Hello, " + acc.username);
                        outputStream.write(acc.username);
                        outputStream.write(acc.password);
                        System.exit(0);
                    }
                }
             }
             else if(n == 2){
                 System.out.println("Please Enter Username:");
                 int username = scan.nextInt();
                 System.out.println("Please Enter Password1:");
                 int password = scan.nextInt();
                 outputStream.write(username);
                 outputStream.write(password);
             }
 
        } catch (IOException er) {
            er.printStackTrace();
        }
        
        
        
    
    }
    
}
